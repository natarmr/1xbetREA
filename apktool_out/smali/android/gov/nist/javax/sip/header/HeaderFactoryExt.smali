.class public interface abstract Landroid/gov/nist/javax/sip/header/HeaderFactoryExt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/header/HeaderFactory;


# virtual methods
.method public abstract createChargingVectorHeader(Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/ims/PChargingVectorHeader;
.end method

.method public abstract createHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;
.end method

.method public abstract createJoinHeader(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/extensions/JoinHeader;
.end method

.method public abstract createPAccessNetworkInfoHeader()Landroid/gov/nist/javax/sip/header/ims/PAccessNetworkInfoHeader;
.end method

.method public abstract createPAssertedIdentityHeader(Landroid/javax/sip/address/Address;)Landroid/gov/nist/javax/sip/header/ims/PAssertedIdentityHeader;
.end method

.method public abstract createPAssertedServiceHeader()Landroid/gov/nist/javax/sip/header/ims/PAssertedServiceHeader;
.end method

.method public abstract createPAssociatedURIHeader(Landroid/javax/sip/address/Address;)Landroid/gov/nist/javax/sip/header/ims/PAssociatedURIHeader;
.end method

.method public abstract createPCalledPartyIDHeader(Landroid/javax/sip/address/Address;)Landroid/gov/nist/javax/sip/header/ims/PCalledPartyIDHeader;
.end method

.method public abstract createPChargingFunctionAddressesHeader()Landroid/gov/nist/javax/sip/header/ims/PChargingFunctionAddressesHeader;
.end method

.method public abstract createPMediaAuthorizationHeader(Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/ims/PMediaAuthorizationHeader;
.end method

.method public abstract createPPreferredIdentityHeader(Landroid/javax/sip/address/Address;)Landroid/gov/nist/javax/sip/header/ims/PPreferredIdentityHeader;
.end method

.method public abstract createPPreferredServiceHeader()Landroid/gov/nist/javax/sip/header/ims/PPreferredServiceHeader;
.end method

.method public abstract createPProfileKeyHeader(Landroid/javax/sip/address/Address;)Landroid/gov/nist/javax/sip/header/ims/PProfileKeyHeader;
.end method

.method public abstract createPServedUserHeader(Landroid/javax/sip/address/Address;)Landroid/gov/nist/javax/sip/header/ims/PServedUserHeader;
.end method

.method public abstract createPUserDatabaseHeader(Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/ims/PUserDatabaseHeader;
.end method

.method public abstract createPVisitedNetworkIDHeader()Landroid/gov/nist/javax/sip/header/ims/PVisitedNetworkIDHeader;
.end method

.method public abstract createPathHeader(Landroid/javax/sip/address/Address;)Landroid/gov/nist/javax/sip/header/ims/PathHeader;
.end method

.method public abstract createPrivacyHeader(Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/ims/PrivacyHeader;
.end method

.method public abstract createReferencesHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/extensions/ReferencesHeader;
.end method

.method public abstract createReferredByHeader(Landroid/javax/sip/address/Address;)Landroid/gov/nist/javax/sip/header/extensions/ReferredByHeader;
.end method

.method public abstract createReplacesHeader(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/extensions/ReplacesHeader;
.end method

.method public abstract createRequestLine(Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/SipRequestLine;
.end method

.method public abstract createSecurityClientHeader()Landroid/gov/nist/javax/sip/header/ims/SecurityClientHeader;
.end method

.method public abstract createSecurityServerHeader()Landroid/gov/nist/javax/sip/header/ims/SecurityServerHeader;
.end method

.method public abstract createSecurityVerifyHeader()Landroid/gov/nist/javax/sip/header/ims/SecurityVerifyHeader;
.end method

.method public abstract createServiceRouteHeader(Landroid/javax/sip/address/Address;)Landroid/gov/nist/javax/sip/header/ims/ServiceRouteHeader;
.end method

.method public abstract createSessionExpiresHeader(I)Landroid/gov/nist/javax/sip/header/extensions/SessionExpiresHeader;
.end method

.method public abstract createStatusLine(Ljava/lang/String;)Landroid/gov/nist/javax/sip/header/SipStatusLine;
.end method
