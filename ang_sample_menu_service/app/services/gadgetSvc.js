/**
 * Created by Anvesh on 5/6/2015.
 */

app.service("gadgetSvc",['$http','$q',function($http,$q){

  /* var gadgets = [
        {
            "item":"1",
            "name": "Apple iPod Touch 4th Generation 32GB with Bonus Accessory Kit",
            "salePrice": 189,
            "shortDescription": "The world's most popular portable gaming device is now even more fun. Listen to your favorite albums. Send text messages over Wi-Fi with iMessage. Record HD video. Make FaceTime calls. iPod touch even works with iCloud, which stores your content and pushes it to all your devices.",
            "thumbnailImage": "http://i.walmartimages.com/i/p/11/13/00/02/31/1113000231755_100X100.jpg",
            "productUrl": "http://www.walmart.com/ip/Apple-iPod-Touch-8GB-32GB-and-64GB-newest-model/15076191"
        },
        {
            "item":"2",
            "name": "Apple iPod Touch 4th Generation 32GB with Bonus Accessory Kit",
            "salePrice": 289,
            "shortDescription": "The world's most popular portable gaming device is now even more fun. Listen to your favorite albums. Send text messages over Wi-Fi with iMessage. Record HD video. Make FaceTime calls. iPod touch even works with iCloud, which stores your content and pushes it to all your devices.",
            "thumbnailImage": "http://i.walmartimages.com/i/p/11/13/00/02/31/1113000231755_100X100.jpg",
            "productUrl": "http://www.walmart.com/ip/Apple-iPod-Touch-8GB-32GB-and-64GB-newest-model/15076191"
        },
        {
            "item":"3",
            "name": "Apple iPod Touch 4th Generation 32GB with Bonus Accessory Kit",
            "salePrice": 389,
            "shortDescription": "The world's most popular portable gaming device is now even more fun. Listen to your favorite albums. Send text messages over Wi-Fi with iMessage. Record HD video. Make FaceTime calls. iPod touch even works with iCloud, which stores your content and pushes it to all your devices.",
            "thumbnailImage": "http://i.walmartimages.com/i/p/11/13/00/02/31/1113000231755_100X100.jpg",
            "productUrl": "http://www.walmart.com/ip/Apple-iPod-Touch-8GB-32GB-and-64GB-newest-model/15076191"
        }
    ];*/
    var gadgets = [];

    return {
        getGadgets:function () {

            var deferred = $q.defer();

            if (gadgets.length > 0) {
                deferred.resolve(gadgets);
            }
            else {
                $http.get("app/data/gadgets.json")
                    .success(function (response) {

                        gadgets = response.gadgets;
                        deferred.resolve(response.gadgets);

                    }).error(function (response) {
                        deferred.reject(response);
                    })


                return deferred.promise;


            }}
            ,
            addGadget:function (gadget) {
                gadgets.push(gadget)
            }

        }



}])