.class public Landroid/gov/nist/javax/sip/stack/DefaultRouter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/address/Router;


# static fields
.field private static logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field private defaultRoute:Landroid/javax/sip/address/Hop;

.field private sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/stack/DefaultRouter;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/javax/sip/SipStack;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    check-cast p1, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 5
    .line 6
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 7
    .line 8
    if-eqz p2, :cond_0

    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getAddressResolver()Landroid/gov/nist/core/net/AddressResolver;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance v0, Landroid/gov/nist/javax/sip/stack/HopImpl;

    .line 15
    .line 16
    invoke-direct {v0, p2}, Landroid/gov/nist/javax/sip/stack/HopImpl;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, v0}, Landroid/gov/nist/core/net/AddressResolver;->resolveAddress(Landroid/javax/sip/address/Hop;)Landroid/javax/sip/address/Hop;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->defaultRoute:Landroid/javax/sip/address/Hop;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception p0

    .line 27
    sget-object p1, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 28
    .line 29
    const-string p2, "Invalid default route specification - need host:port/transport"

    .line 30
    .line 31
    invoke-interface {p1, p2}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p0

    .line 35
    :cond_0
    return-void
.end method


# virtual methods
.method public final createHop(Landroid/javax/sip/address/SipURI;Landroid/javax/sip/message/Request;)Landroid/javax/sip/address/Hop;
    .locals 3

    .line 1
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->isSecure()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "tls"

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    move-object v0, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->getTransportParam()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :goto_0
    if-nez v0, :cond_2

    .line 16
    .line 17
    const-string v2, "Via"

    .line 18
    .line 19
    invoke-interface {p2, v2}, Landroid/javax/sip/message/Message;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    check-cast p2, Landroid/javax/sip/header/ViaHeader;

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    invoke-interface {p2}, Landroid/javax/sip/header/ViaHeader;->getTransport()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :cond_1
    if-nez v0, :cond_2

    .line 32
    .line 33
    const-string v0, "UDP"

    .line 34
    .line 35
    :cond_2
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->getPort()I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    const/4 v2, -0x1

    .line 40
    if-eq p2, v2, :cond_3

    .line 41
    .line 42
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->getPort()I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    goto :goto_1

    .line 47
    :cond_3
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    if-eqz p2, :cond_4

    .line 52
    .line 53
    const/16 p2, 0x13c5

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_4
    const/16 p2, 0x13c4

    .line 57
    .line 58
    :goto_1
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->getMAddrParam()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    if-eqz v1, :cond_5

    .line 63
    .line 64
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->getMAddrParam()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    goto :goto_2

    .line 69
    :cond_5
    invoke-interface {p1}, Landroid/javax/sip/address/SipURI;->getHost()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    :goto_2
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 74
    .line 75
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getAddressResolver()Landroid/gov/nist/core/net/AddressResolver;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    new-instance v1, Landroid/gov/nist/javax/sip/stack/HopImpl;

    .line 80
    .line 81
    invoke-direct {v1, p1, p2, v0}, Landroid/gov/nist/javax/sip/stack/HopImpl;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p0, v1}, Landroid/gov/nist/core/net/AddressResolver;->resolveAddress(Landroid/javax/sip/address/Hop;)Landroid/javax/sip/address/Hop;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    return-object p0
.end method

.method public fixStrictRouting(Landroid/gov/nist/javax/sip/message/SIPRequest;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRouteHeaders()Landroid/gov/nist/javax/sip/header/RouteList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getFirst()Landroid/javax/sip/header/Header;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/gov/nist/javax/sip/header/Route;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->getAddress()Landroid/javax/sip/address/Address;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Landroid/javax/sip/address/Address;->getURI()Landroid/javax/sip/address/URI;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->removeFirst()V

    .line 22
    .line 23
    .line 24
    new-instance v1, Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 25
    .line 26
    invoke-direct {v1}, Landroid/gov/nist/javax/sip/address/AddressImpl;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getRequestURI()Landroid/javax/sip/address/URI;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v1, v2}, Landroid/gov/nist/javax/sip/address/AddressImpl;->setAddess(Landroid/javax/sip/address/URI;)V

    .line 34
    .line 35
    .line 36
    new-instance v2, Landroid/gov/nist/javax/sip/header/Route;

    .line 37
    .line 38
    invoke-direct {v2, v1}, Landroid/gov/nist/javax/sip/header/Route;-><init>(Landroid/gov/nist/javax/sip/address/AddressImpl;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v2}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->add(Landroid/gov/nist/javax/sip/header/SIPHeader;)Z

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->setRequestURI(Landroid/javax/sip/address/URI;)V

    .line 45
    .line 46
    .line 47
    sget-object p0, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 48
    .line 49
    const/16 v0, 0x20

    .line 50
    .line 51
    invoke-interface {p0, v0}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_0

    .line 56
    .line 57
    sget-object p0, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 58
    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v1, "post: fixStrictRouting"

    .line 62
    .line 63
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :cond_0
    return-void
.end method

.method public getNextHop(Landroid/javax/sip/message/Request;)Landroid/javax/sip/address/Hop;
    .locals 6

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 3
    .line 4
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getRequestLine()Landroid/gov/nist/javax/sip/header/RequestLine;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->defaultRoute:Landroid/javax/sip/address/Hop;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/RequestLine;->getUri()Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_c

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRouteHeaders()Landroid/gov/nist/javax/sip/header/RouteList;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const/16 v4, 0x20

    .line 25
    .line 26
    if-eqz v3, :cond_4

    .line 27
    .line 28
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getFirst()Landroid/javax/sip/header/Header;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    if-eqz v5, :cond_4

    .line 33
    .line 34
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/header/SIPHeaderList;->getFirst()Landroid/javax/sip/header/Header;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Landroid/gov/nist/javax/sip/header/Route;

    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/header/AddressParametersHeader;->getAddress()Landroid/javax/sip/address/Address;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {v1}, Landroid/javax/sip/address/Address;->getURI()Landroid/javax/sip/address/URI;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {v1}, Landroid/javax/sip/address/URI;->isSipURI()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_3

    .line 53
    .line 54
    check-cast v1, Landroid/javax/sip/address/SipURI;

    .line 55
    .line 56
    invoke-interface {v1}, Landroid/javax/sip/address/SipURI;->hasLrParam()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-nez v2, :cond_1

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->fixStrictRouting(Landroid/gov/nist/javax/sip/message/SIPRequest;)V

    .line 63
    .line 64
    .line 65
    sget-object v0, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 66
    .line 67
    invoke-interface {v0, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_1

    .line 72
    .line 73
    sget-object v0, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 74
    .line 75
    const-string v2, "Route post processing fixed strict routing"

    .line 76
    .line 77
    invoke-interface {v0, v2}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :cond_1
    invoke-virtual {p0, v1, p1}, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->createHop(Landroid/javax/sip/address/SipURI;Landroid/javax/sip/message/Request;)Landroid/javax/sip/address/Hop;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    sget-object p1, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 85
    .line 86
    invoke-interface {p1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-eqz p1, :cond_2

    .line 91
    .line 92
    sget-object p1, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 93
    .line 94
    new-instance v0, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v1, "NextHop based on Route:"

    .line 97
    .line 98
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :cond_2
    return-object p0

    .line 112
    :cond_3
    const-string p0, "First Route not a SIP URI"

    .line 113
    .line 114
    invoke-static {p0}, La/v4i0;->k(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-object v2

    .line 118
    :cond_4
    invoke-interface {v1}, Landroid/javax/sip/address/URI;->isSipURI()Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_6

    .line 123
    .line 124
    move-object v0, v1

    .line 125
    check-cast v0, Landroid/javax/sip/address/SipURI;

    .line 126
    .line 127
    invoke-interface {v0}, Landroid/javax/sip/address/SipURI;->getMAddrParam()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    if-eqz v3, :cond_6

    .line 132
    .line 133
    invoke-virtual {p0, v0, p1}, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->createHop(Landroid/javax/sip/address/SipURI;Landroid/javax/sip/message/Request;)Landroid/javax/sip/address/Hop;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    sget-object p1, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 138
    .line 139
    invoke-interface {p1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    if-eqz p1, :cond_5

    .line 144
    .line 145
    sget-object p1, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 146
    .line 147
    new-instance v0, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    const-string v1, "Using request URI maddr to route the request = "

    .line 150
    .line 151
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-interface {p0}, Landroid/javax/sip/address/Hop;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    :cond_5
    return-object p0

    .line 169
    :cond_6
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->defaultRoute:Landroid/javax/sip/address/Hop;

    .line 170
    .line 171
    if-eqz v0, :cond_8

    .line 172
    .line 173
    sget-object p1, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 174
    .line 175
    invoke-interface {p1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    if-eqz p1, :cond_7

    .line 180
    .line 181
    sget-object p1, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 182
    .line 183
    new-instance v0, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    const-string v1, "Using outbound proxy to route the request = "

    .line 186
    .line 187
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->defaultRoute:Landroid/javax/sip/address/Hop;

    .line 191
    .line 192
    invoke-interface {v1}, Landroid/javax/sip/address/Hop;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    :cond_7
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->defaultRoute:Landroid/javax/sip/address/Hop;

    .line 207
    .line 208
    return-object p0

    .line 209
    :cond_8
    invoke-interface {v1}, Landroid/javax/sip/address/URI;->isSipURI()Z

    .line 210
    .line 211
    .line 212
    move-result v0

    .line 213
    if-eqz v0, :cond_b

    .line 214
    .line 215
    check-cast v1, Landroid/javax/sip/address/SipURI;

    .line 216
    .line 217
    invoke-virtual {p0, v1, p1}, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->createHop(Landroid/javax/sip/address/SipURI;Landroid/javax/sip/message/Request;)Landroid/javax/sip/address/Hop;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    if-eqz p0, :cond_9

    .line 222
    .line 223
    sget-object p1, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 224
    .line 225
    invoke-interface {p1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 226
    .line 227
    .line 228
    move-result p1

    .line 229
    if-eqz p1, :cond_9

    .line 230
    .line 231
    sget-object p1, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 232
    .line 233
    new-instance v0, Ljava/lang/StringBuilder;

    .line 234
    .line 235
    const-string v1, "Used request-URI for nextHop = "

    .line 236
    .line 237
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-interface {p0}, Landroid/javax/sip/address/Hop;->toString()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    return-object p0

    .line 255
    :cond_9
    sget-object p1, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 256
    .line 257
    invoke-interface {p1, v4}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 258
    .line 259
    .line 260
    move-result p1

    .line 261
    if-eqz p1, :cond_a

    .line 262
    .line 263
    sget-object p1, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 264
    .line 265
    const-string v0, "returning null hop -- loop detected"

    .line 266
    .line 267
    invoke-interface {p1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    :cond_a
    return-object p0

    .line 271
    :cond_b
    const-string p0, "Unexpected non-sip URI"

    .line 272
    .line 273
    sget-object p1, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->logger:Landroid/gov/nist/core/StackLogger;

    .line 274
    .line 275
    invoke-static {p0, p1}, Landroid/gov/nist/core/InternalErrorHandler;->handleException(Ljava/lang/String;Landroid/gov/nist/core/StackLogger;)V

    .line 276
    .line 277
    .line 278
    return-object v2

    .line 279
    :cond_c
    const-string p0, "Bad message: Null requestURI"

    .line 280
    .line 281
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    return-object v2
.end method

.method public getNextHops(Landroid/javax/sip/message/Request;)Ljava/util/ListIterator;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Ljava/util/LinkedList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->getNextHop(Landroid/javax/sip/message/Request;)Landroid/javax/sip/address/Hop;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {v0, p0}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/AbstractList;->listIterator()Ljava/util/ListIterator;

    .line 14
    .line 15
    .line 16
    move-result-object p0
    :try_end_0
    .catch Landroid/javax/sip/SipException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    return-object p0

    .line 18
    :catch_0
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public getOutboundProxy()Landroid/javax/sip/address/Hop;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/DefaultRouter;->defaultRoute:Landroid/javax/sip/address/Hop;

    .line 2
    .line 3
    return-object p0
.end method
