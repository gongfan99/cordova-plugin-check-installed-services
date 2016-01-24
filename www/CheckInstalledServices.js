/*global cordova, module*/

module.exports = {
    check: function (successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "CheckInstalledServices", "check", []);
    }
};