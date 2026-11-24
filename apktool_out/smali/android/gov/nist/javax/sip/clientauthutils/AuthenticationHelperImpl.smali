.class public Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelper;


# static fields
.field private static logger:Landroid/gov/nist/core/StackLogger;


# instance fields
.field private accountManager:Ljava/lang/Object;

.field private cachedCredentials:Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache;

.field private headerFactory:Landroid/javax/sip/header/HeaderFactory;

.field private sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

.field timer:Ljava/util/Timer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/gov/nist/core/CommonLogger;->getLogger(Ljava/lang/Class;)Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/clientauthutils/AccountManager;Landroid/javax/sip/header/HeaderFactory;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->accountManager:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p3, p0, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->headerFactory:Landroid/javax/sip/header/HeaderFactory;

    .line 7
    .line 8
    iput-object p1, p0, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 9
    .line 10
    new-instance p2, Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-direct {p2, p1}, Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache;-><init>(Landroid/gov/nist/javax/sip/stack/timers/SipTimer;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->cachedCredentials:Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;Landroid/gov/nist/javax/sip/clientauthutils/SecureAccountManager;Landroid/javax/sip/header/HeaderFactory;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p2, p0, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->accountManager:Ljava/lang/Object;

    .line 24
    iput-object p3, p0, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->headerFactory:Landroid/javax/sip/header/HeaderFactory;

    .line 25
    iput-object p1, p0, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->sipStack:Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 26
    new-instance p2, Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache;

    invoke-virtual {p1}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    move-result-object p1

    invoke-direct {p2, p1}, Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache;-><init>(Landroid/gov/nist/javax/sip/stack/timers/SipTimer;)V

    iput-object p2, p0, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->cachedCredentials:Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache;

    return-void
.end method

.method private getAuthorization(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/javax/sip/header/WWWAuthenticateHeader;Landroid/gov/nist/javax/sip/clientauthutils/UserCredentialHash;)Landroid/javax/sip/header/AuthorizationHeader;
    .locals 12

    .line 155
    invoke-interface/range {p4 .. p4}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getQop()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 156
    const-string v0, "auth"

    move-object v10, v0

    goto :goto_0

    :cond_0
    move-object v10, v1

    .line 157
    :goto_0
    invoke-interface/range {p4 .. p4}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getAlgorithm()Ljava/lang/String;

    move-result-object v2

    invoke-interface/range {p5 .. p5}, Landroid/gov/nist/javax/sip/clientauthutils/UserCredentialHash;->getHashUserDomainPassword()Ljava/lang/String;

    move-result-object v3

    invoke-interface/range {p4 .. p4}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getNonce()Ljava/lang/String;

    move-result-object v4

    sget-object v11, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->logger:Landroid/gov/nist/core/StackLogger;

    const-string v5, "00000001"

    const-string v6, "xyz"

    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    invoke-static/range {v2 .. v11}, Landroid/gov/nist/javax/sip/clientauthutils/MessageDigestAlgorithm;->calculateResponse(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/gov/nist/core/StackLogger;)Ljava/lang/String;

    move-result-object p1

    move-object/from16 p3, p4

    .line 158
    :try_start_0
    instance-of v0, p3, Landroid/javax/sip/header/ProxyAuthenticateHeader;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 159
    iget-object p0, p0, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->headerFactory:Landroid/javax/sip/header/HeaderFactory;

    if-eqz v0, :cond_1

    .line 160
    :try_start_1
    invoke-interface {p3}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getScheme()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Landroid/javax/sip/header/HeaderFactory;->createProxyAuthorizationHeader(Ljava/lang/String;)Landroid/javax/sip/header/ProxyAuthorizationHeader;

    move-result-object p0

    goto :goto_1

    .line 161
    :cond_1
    invoke-interface {p3}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getScheme()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Landroid/javax/sip/header/HeaderFactory;->createAuthorizationHeader(Ljava/lang/String;)Landroid/javax/sip/header/AuthorizationHeader;

    move-result-object p0

    .line 162
    :goto_1
    invoke-interface/range {p5 .. p5}, Landroid/gov/nist/javax/sip/clientauthutils/UserCredentialHash;->getUserName()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Landroid/javax/sip/header/AuthorizationHeader;->setUsername(Ljava/lang/String;)V

    .line 163
    invoke-interface {p3}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getRealm()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Landroid/javax/sip/header/AuthorizationHeader;->setRealm(Ljava/lang/String;)V

    .line 164
    invoke-interface {p3}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getNonce()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Landroid/javax/sip/header/AuthorizationHeader;->setNonce(Ljava/lang/String;)V

    .line 165
    const-string v0, "uri"

    invoke-interface {p0, v0, p2}, Landroid/javax/sip/header/Parameters;->setParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 166
    invoke-interface {p0, p1}, Landroid/javax/sip/header/AuthorizationHeader;->setResponse(Ljava/lang/String;)V

    .line 167
    invoke-interface {p3}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getAlgorithm()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_2

    .line 168
    invoke-interface {p3}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getAlgorithm()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, p2}, Landroid/javax/sip/header/AuthorizationHeader;->setAlgorithm(Ljava/lang/String;)V

    .line 169
    :cond_2
    invoke-interface {p3}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getOpaque()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_3

    .line 170
    invoke-interface {p3}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getOpaque()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, p2}, Landroid/javax/sip/header/AuthorizationHeader;->setOpaque(Ljava/lang/String;)V

    :cond_3
    if-eqz v10, :cond_4

    .line 171
    invoke-interface {p0, v10}, Landroid/javax/sip/header/AuthorizationHeader;->setQop(Ljava/lang/String;)V

    .line 172
    invoke-interface {p0, v6}, Landroid/javax/sip/header/AuthorizationHeader;->setCNonce(Ljava/lang/String;)V

    .line 173
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    invoke-interface {p0, p2}, Landroid/javax/sip/header/AuthorizationHeader;->setNonceCount(I)V

    .line 174
    :cond_4
    invoke-interface {p0, p1}, Landroid/javax/sip/header/AuthorizationHeader;->setResponse(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p0

    .line 175
    :catch_0
    const-string p0, "Failed to create an authorization header!"

    invoke-static {p0}, La/itt0;->k(Ljava/lang/String;)V

    return-object v1
.end method

.method private getAuthorization(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/javax/sip/header/WWWAuthenticateHeader;Landroid/gov/nist/javax/sip/clientauthutils/UserCredentials;)Landroid/javax/sip/header/AuthorizationHeader;
    .locals 14

    .line 1
    invoke-interface/range {p4 .. p4}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getQop()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "auth"

    .line 9
    .line 10
    move-object v12, v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object v12, v1

    .line 13
    :goto_0
    invoke-interface/range {p4 .. p4}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getAlgorithm()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface/range {p5 .. p5}, Landroid/gov/nist/javax/sip/clientauthutils/UserCredentials;->getUserName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-interface/range {p4 .. p4}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getRealm()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-interface/range {p5 .. p5}, Landroid/gov/nist/javax/sip/clientauthutils/UserCredentials;->getPassword()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-interface/range {p4 .. p4}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getNonce()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    sget-object v13, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 34
    .line 35
    const-string v7, "00000001"

    .line 36
    .line 37
    const-string v8, "xyz"

    .line 38
    .line 39
    move-object v9, p1

    .line 40
    move-object/from16 v10, p2

    .line 41
    .line 42
    move-object/from16 v11, p3

    .line 43
    .line 44
    invoke-static/range {v2 .. v13}, Landroid/gov/nist/javax/sip/clientauthutils/MessageDigestAlgorithm;->calculateResponse(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/gov/nist/core/StackLogger;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    move-object/from16 v0, p4

    .line 49
    .line 50
    :try_start_0
    instance-of v2, v0, Landroid/javax/sip/header/ProxyAuthenticateHeader;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    iget-object p0, p0, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->headerFactory:Landroid/javax/sip/header/HeaderFactory;

    .line 53
    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    :try_start_1
    invoke-interface {v0}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getScheme()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-interface {p0, v2}, Landroid/javax/sip/header/HeaderFactory;->createProxyAuthorizationHeader(Ljava/lang/String;)Landroid/javax/sip/header/ProxyAuthorizationHeader;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    invoke-interface {v0}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getScheme()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-interface {p0, v2}, Landroid/javax/sip/header/HeaderFactory;->createAuthorizationHeader(Ljava/lang/String;)Landroid/javax/sip/header/AuthorizationHeader;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    :goto_1
    invoke-interface/range {p5 .. p5}, Landroid/gov/nist/javax/sip/clientauthutils/UserCredentials;->getUserName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-interface {p0, v2}, Landroid/javax/sip/header/AuthorizationHeader;->setUsername(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    invoke-interface {v0}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getRealm()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-interface {p0, v2}, Landroid/javax/sip/header/AuthorizationHeader;->setRealm(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v0}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getNonce()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-interface {p0, v2}, Landroid/javax/sip/header/AuthorizationHeader;->setNonce(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const-string v2, "uri"

    .line 95
    .line 96
    move-object/from16 v10, p2

    .line 97
    .line 98
    invoke-interface {p0, v2, v10}, Landroid/javax/sip/header/Parameters;->setParameter(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-interface {p0, p1}, Landroid/javax/sip/header/AuthorizationHeader;->setResponse(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v0}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getAlgorithm()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    if-eqz v2, :cond_2

    .line 109
    .line 110
    invoke-interface {v0}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getAlgorithm()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-interface {p0, v2}, Landroid/javax/sip/header/AuthorizationHeader;->setAlgorithm(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    :cond_2
    invoke-interface {v0}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getOpaque()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    if-eqz v2, :cond_3

    .line 122
    .line 123
    invoke-interface {v0}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getOpaque()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-interface {p0, v0}, Landroid/javax/sip/header/AuthorizationHeader;->setOpaque(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    :cond_3
    if-eqz v12, :cond_4

    .line 131
    .line 132
    invoke-interface {p0, v12}, Landroid/javax/sip/header/AuthorizationHeader;->setQop(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-interface {p0, v8}, Landroid/javax/sip/header/AuthorizationHeader;->setCNonce(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    invoke-interface {p0, v0}, Landroid/javax/sip/header/AuthorizationHeader;->setNonceCount(I)V

    .line 143
    .line 144
    .line 145
    :cond_4
    invoke-interface {p0, p1}, Landroid/javax/sip/header/AuthorizationHeader;->setResponse(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0

    .line 146
    .line 147
    .line 148
    return-object p0

    .line 149
    :catch_0
    const-string p0, "Failed to create an authorization header!"

    .line 150
    .line 151
    invoke-static {p0}, La/itt0;->k(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-object v1
.end method

.method private removeBranchID(Landroid/javax/sip/message/Request;)V
    .locals 0

    .line 1
    const-string p0, "Via"

    .line 2
    .line 3
    invoke-interface {p1, p0}, Landroid/javax/sip/message/Message;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/javax/sip/header/ViaHeader;

    .line 8
    .line 9
    const-string p1, "branch"

    .line 10
    .line 11
    invoke-interface {p0, p1}, Landroid/javax/sip/header/Parameters;->removeParameter(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public handleChallenge(Landroid/javax/sip/message/Response;Landroid/javax/sip/ClientTransaction;Landroid/javax/sip/SipProvider;I)Landroid/javax/sip/ClientTransaction;
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    .line 542
    invoke-virtual/range {v0 .. v5}, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->handleChallenge(Landroid/javax/sip/message/Response;Landroid/javax/sip/ClientTransaction;Landroid/javax/sip/SipProvider;IZ)Landroid/javax/sip/ClientTransaction;

    move-result-object p0

    return-object p0
.end method

.method public handleChallenge(Landroid/javax/sip/message/Response;Landroid/javax/sip/ClientTransaction;Landroid/javax/sip/SipProvider;IZ)Landroid/javax/sip/ClientTransaction;
    .locals 9

    .line 1
    const-string v0, "handleChallenge: "

    .line 2
    .line 3
    :try_start_0
    sget-object v1, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 4
    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    invoke-interface {v1, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    sget-object v1, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 14
    .line 15
    new-instance v3, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v1, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-interface {p2}, Landroid/javax/sip/Transaction;->getRequest()Landroid/javax/sip/message/Request;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getToTag()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-nez v1, :cond_3

    .line 41
    .line 42
    invoke-interface {p2}, Landroid/javax/sip/Transaction;->getDialog()Landroid/javax/sip/Dialog;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eqz v1, :cond_3

    .line 47
    .line 48
    invoke-interface {p2}, Landroid/javax/sip/Transaction;->getDialog()Landroid/javax/sip/Dialog;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-interface {v1}, Landroid/javax/sip/Dialog;->getState()Landroid/javax/sip/DialogState;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    sget-object v3, Landroid/javax/sip/DialogState;->CONFIRMED:Landroid/javax/sip/DialogState;

    .line 57
    .line 58
    if-eq v1, v3, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    invoke-interface {p2}, Landroid/javax/sip/Transaction;->getDialog()Landroid/javax/sip/Dialog;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->getMethod()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-interface {v1, v3}, Landroid/javax/sip/Dialog;->createRequest(Ljava/lang/String;)Landroid/javax/sip/message/Request;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeaderNames()Ljava/util/ListIterator;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_4

    .line 82
    .line 83
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    check-cast v4, Ljava/lang/String;

    .line 88
    .line 89
    invoke-interface {v1, v4}, Landroid/javax/sip/message/Message;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    if-nez v5, :cond_2

    .line 94
    .line 95
    invoke-virtual {v0, v4}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getHeaders(Ljava/lang/String;)Ljava/util/ListIterator;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    :goto_0
    invoke-interface {v4}, Ljava/util/ListIterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-eqz v5, :cond_2

    .line 104
    .line 105
    invoke-interface {v4}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    check-cast v5, Landroid/javax/sip/header/Header;

    .line 110
    .line 111
    invoke-interface {v1, v5}, Landroid/javax/sip/message/Message;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_3
    :goto_1
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPRequest;->clone()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, Landroid/javax/sip/message/Request;

    .line 120
    .line 121
    :cond_4
    invoke-direct {p0, v1}, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->removeBranchID(Landroid/javax/sip/message/Request;)V

    .line 122
    .line 123
    .line 124
    if-eqz p1, :cond_12

    .line 125
    .line 126
    if-eqz v1, :cond_12

    .line 127
    .line 128
    invoke-interface {p1}, Landroid/javax/sip/message/Response;->getStatusCode()I

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    const/16 v4, 0x191

    .line 133
    .line 134
    if-ne v3, v4, :cond_5

    .line 135
    .line 136
    const-string v3, "WWW-Authenticate"

    .line 137
    .line 138
    invoke-interface {p1, v3}, Landroid/javax/sip/message/Message;->getHeaders(Ljava/lang/String;)Ljava/util/ListIterator;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    goto :goto_2

    .line 143
    :cond_5
    invoke-interface {p1}, Landroid/javax/sip/message/Response;->getStatusCode()I

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    const/16 v4, 0x197

    .line 148
    .line 149
    if-ne v3, v4, :cond_11

    .line 150
    .line 151
    const-string v3, "Proxy-Authenticate"

    .line 152
    .line 153
    invoke-interface {p1, v3}, Landroid/javax/sip/message/Message;->getHeaders(Ljava/lang/String;)Ljava/util/ListIterator;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    :goto_2
    if-eqz p1, :cond_10

    .line 158
    .line 159
    const-string v3, "Authorization"

    .line 160
    .line 161
    invoke-interface {v1, v3}, Landroid/javax/sip/message/Message;->removeHeader(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    const-string v3, "Proxy-Authorization"

    .line 165
    .line 166
    invoke-interface {v1, v3}, Landroid/javax/sip/message/Message;->removeHeader(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    const-string v3, "CSeq"

    .line 170
    .line 171
    invoke-interface {v1, v3}, Landroid/javax/sip/message/Message;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    check-cast v3, Landroid/javax/sip/header/CSeqHeader;
    :try_end_0
    .catch Landroid/javax/sip/SipException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 176
    .line 177
    :try_start_1
    invoke-interface {v3}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 178
    .line 179
    .line 180
    move-result-wide v4

    .line 181
    const-wide/16 v6, 0x1

    .line 182
    .line 183
    add-long/2addr v4, v6

    .line 184
    invoke-interface {v3, v4, v5}, Landroid/javax/sip/header/CSeqHeader;->setSeqNumber(J)V
    :try_end_1
    .catch Landroid/javax/sip/InvalidArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Landroid/javax/sip/SipException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 185
    .line 186
    .line 187
    if-nez p5, :cond_6

    .line 188
    .line 189
    :try_start_2
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getRouteHeaders()Landroid/gov/nist/javax/sip/header/RouteList;

    .line 190
    .line 191
    .line 192
    move-result-object p5

    .line 193
    if-nez p5, :cond_6

    .line 194
    .line 195
    move-object p5, p2

    .line 196
    check-cast p5, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;

    .line 197
    .line 198
    invoke-interface {p5}, Landroid/gov/nist/javax/sip/stack/SIPClientTransaction;->getNextHop()Landroid/javax/sip/address/Hop;

    .line 199
    .line 200
    .line 201
    move-result-object p5

    .line 202
    invoke-interface {v1}, Landroid/javax/sip/message/Request;->getRequestURI()Landroid/javax/sip/address/URI;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    check-cast v3, Landroid/javax/sip/address/SipURI;

    .line 207
    .line 208
    invoke-interface {p5}, Landroid/javax/sip/address/Hop;->getHost()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    invoke-interface {v3, v4}, Landroid/javax/sip/address/SipURI;->setMAddrParam(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-interface {p5}, Landroid/javax/sip/address/Hop;->getPort()I

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    const/4 v5, -0x1

    .line 220
    if-eq v4, v5, :cond_6

    .line 221
    .line 222
    invoke-interface {p5}, Landroid/javax/sip/address/Hop;->getPort()I

    .line 223
    .line 224
    .line 225
    move-result p5

    .line 226
    invoke-interface {v3, p5}, Landroid/javax/sip/address/SipURI;->setPort(I)V

    .line 227
    .line 228
    .line 229
    :cond_6
    invoke-interface {p3, v1}, Landroid/javax/sip/SipProvider;->getNewClientTransaction(Landroid/javax/sip/message/Request;)Landroid/javax/sip/ClientTransaction;

    .line 230
    .line 231
    .line 232
    move-result-object p3

    .line 233
    invoke-interface {p2}, Landroid/javax/sip/Transaction;->getRequest()Landroid/javax/sip/message/Request;

    .line 234
    .line 235
    .line 236
    move-result-object p5

    .line 237
    invoke-interface {p5}, Landroid/javax/sip/message/Request;->getRequestURI()Landroid/javax/sip/address/URI;

    .line 238
    .line 239
    .line 240
    move-result-object p5

    .line 241
    check-cast p5, Landroid/javax/sip/address/SipURI;

    .line 242
    .line 243
    :goto_3
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    .line 244
    .line 245
    .line 246
    move-result p5

    .line 247
    if-eqz p5, :cond_e

    .line 248
    .line 249
    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object p5

    .line 253
    move-object v7, p5

    .line 254
    check-cast v7, Landroid/javax/sip/header/WWWAuthenticateHeader;

    .line 255
    .line 256
    invoke-interface {v7}, Landroid/javax/sip/header/WWWAuthenticateHeader;->getRealm()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p5

    .line 260
    iget-object v3, p0, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->accountManager:Ljava/lang/Object;

    .line 261
    .line 262
    instance-of v4, v3, Landroid/gov/nist/javax/sip/clientauthutils/SecureAccountManager;
    :try_end_2
    .catch Landroid/javax/sip/SipException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 263
    .line 264
    const-string v5, ""

    .line 265
    .line 266
    const-string v6, "Cannot find user creds for the given user name and realm"

    .line 267
    .line 268
    if-eqz v4, :cond_9

    .line 269
    .line 270
    :try_start_3
    check-cast v3, Landroid/gov/nist/javax/sip/clientauthutils/SecureAccountManager;

    .line 271
    .line 272
    invoke-interface {v3, p2, p5}, Landroid/gov/nist/javax/sip/clientauthutils/SecureAccountManager;->getCredentialHash(Landroid/javax/sip/ClientTransaction;Ljava/lang/String;)Landroid/gov/nist/javax/sip/clientauthutils/UserCredentialHash;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    if-eqz v8, :cond_8

    .line 277
    .line 278
    invoke-interface {v1}, Landroid/javax/sip/message/Request;->getRequestURI()Landroid/javax/sip/address/URI;

    .line 279
    .line 280
    .line 281
    move-result-object p5

    .line 282
    invoke-interface {v8}, Landroid/gov/nist/javax/sip/clientauthutils/UserCredentialHash;->getSipDomain()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    invoke-interface {v1}, Landroid/javax/sip/message/Request;->getMethod()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    invoke-interface {p5}, Landroid/javax/sip/address/URI;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p5

    .line 293
    invoke-interface {v1}, Landroid/javax/sip/message/Message;->getContent()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v3

    .line 297
    if-nez v3, :cond_7

    .line 298
    .line 299
    :goto_4
    move-object v3, p0

    .line 300
    move-object v6, v5

    .line 301
    move-object v5, p5

    .line 302
    goto :goto_5

    .line 303
    :cond_7
    new-instance v5, Ljava/lang/String;

    .line 304
    .line 305
    invoke-interface {v1}, Landroid/javax/sip/message/Message;->getRawContent()[B

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    invoke-direct {v5, v3}, Ljava/lang/String;-><init>([B)V

    .line 310
    .line 311
    .line 312
    goto :goto_4

    .line 313
    :goto_5
    invoke-direct/range {v3 .. v8}, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->getAuthorization(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/javax/sip/header/WWWAuthenticateHeader;Landroid/gov/nist/javax/sip/clientauthutils/UserCredentialHash;)Landroid/javax/sip/header/AuthorizationHeader;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    move-object v4, v3

    .line 318
    move-object v3, v4

    .line 319
    goto :goto_8

    .line 320
    :cond_8
    sget-object p0, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 321
    .line 322
    const-string p1, "Could not find creds"

    .line 323
    .line 324
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    new-instance p0, Landroid/javax/sip/SipException;

    .line 328
    .line 329
    invoke-direct {p0, v6}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    throw p0

    .line 333
    :cond_9
    move-object v4, p0

    .line 334
    check-cast v3, Landroid/gov/nist/javax/sip/clientauthutils/AccountManager;

    .line 335
    .line 336
    invoke-interface {v3, p2, p5}, Landroid/gov/nist/javax/sip/clientauthutils/AccountManager;->getCredentials(Landroid/javax/sip/ClientTransaction;Ljava/lang/String;)Landroid/gov/nist/javax/sip/clientauthutils/UserCredentials;

    .line 337
    .line 338
    .line 339
    move-result-object v8

    .line 340
    if-eqz v8, :cond_d

    .line 341
    .line 342
    invoke-interface {v8}, Landroid/gov/nist/javax/sip/clientauthutils/UserCredentials;->getSipDomain()Ljava/lang/String;

    .line 343
    .line 344
    .line 345
    move-object v3, v4

    .line 346
    invoke-interface {v1}, Landroid/javax/sip/message/Request;->getMethod()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v4

    .line 350
    invoke-interface {v1}, Landroid/javax/sip/message/Request;->getRequestURI()Landroid/javax/sip/address/URI;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    invoke-interface {p0}, Landroid/javax/sip/address/URI;->toString()Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    invoke-interface {v1}, Landroid/javax/sip/message/Message;->getContent()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object p5

    .line 362
    if-nez p5, :cond_a

    .line 363
    .line 364
    :goto_6
    move-object v6, v5

    .line 365
    move-object v5, p0

    .line 366
    goto :goto_7

    .line 367
    :cond_a
    new-instance v5, Ljava/lang/String;

    .line 368
    .line 369
    invoke-interface {v1}, Landroid/javax/sip/message/Message;->getRawContent()[B

    .line 370
    .line 371
    .line 372
    move-result-object p5

    .line 373
    invoke-direct {v5, p5}, Ljava/lang/String;-><init>([B)V

    .line 374
    .line 375
    .line 376
    goto :goto_6

    .line 377
    :goto_7
    invoke-direct/range {v3 .. v8}, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->getAuthorization(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/javax/sip/header/WWWAuthenticateHeader;Landroid/gov/nist/javax/sip/clientauthutils/UserCredentials;)Landroid/javax/sip/header/AuthorizationHeader;

    .line 378
    .line 379
    .line 380
    move-result-object p0

    .line 381
    :goto_8
    sget-object p5, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 382
    .line 383
    invoke-interface {p5, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 384
    .line 385
    .line 386
    move-result p5

    .line 387
    if-eqz p5, :cond_b

    .line 388
    .line 389
    sget-object p5, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 390
    .line 391
    new-instance v4, Ljava/lang/StringBuilder;

    .line 392
    .line 393
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 394
    .line 395
    .line 396
    const-string v5, "Created authorization header: "

    .line 397
    .line 398
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v5

    .line 405
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v4

    .line 412
    invoke-interface {p5, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    :cond_b
    if-eqz p4, :cond_c

    .line 416
    .line 417
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 418
    .line 419
    .line 420
    move-result-object p5

    .line 421
    invoke-interface {p5}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object p5

    .line 425
    iget-object v4, v3, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->cachedCredentials:Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache;

    .line 426
    .line 427
    invoke-virtual {v4, p5, p0, p4}, Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache;->cacheAuthorizationHeader(Ljava/lang/String;Landroid/javax/sip/header/AuthorizationHeader;I)V

    .line 428
    .line 429
    .line 430
    :cond_c
    invoke-interface {v1, p0}, Landroid/javax/sip/message/Message;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 431
    .line 432
    .line 433
    move-object p0, v3

    .line 434
    goto/16 :goto_3

    .line 435
    .line 436
    :cond_d
    new-instance p0, Landroid/javax/sip/SipException;

    .line 437
    .line 438
    invoke-direct {p0, v6}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    throw p0

    .line 442
    :cond_e
    sget-object p0, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 443
    .line 444
    invoke-interface {p0, v2}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 445
    .line 446
    .line 447
    move-result p0

    .line 448
    if-eqz p0, :cond_f

    .line 449
    .line 450
    sget-object p0, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 451
    .line 452
    new-instance p1, Ljava/lang/StringBuilder;

    .line 453
    .line 454
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 455
    .line 456
    .line 457
    const-string p2, "Returning authorization transaction."

    .line 458
    .line 459
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object p1

    .line 469
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    :cond_f
    return-object p3

    .line 473
    :catch_0
    new-instance p0, Landroid/javax/sip/SipException;

    .line 474
    .line 475
    new-instance p1, Ljava/lang/StringBuilder;

    .line 476
    .line 477
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 478
    .line 479
    .line 480
    const-string p2, "Invalid CSeq -- could not increment : "

    .line 481
    .line 482
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 483
    .line 484
    .line 485
    invoke-interface {v3}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 486
    .line 487
    .line 488
    move-result-wide p2

    .line 489
    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object p1

    .line 496
    invoke-direct {p0, p1}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;)V

    .line 497
    .line 498
    .line 499
    throw p0

    .line 500
    :cond_10
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 501
    .line 502
    const-string p1, "Could not find WWWAuthenticate or ProxyAuthenticate headers"

    .line 503
    .line 504
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    throw p0

    .line 508
    :cond_11
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 509
    .line 510
    const-string p1, "Unexpected status code "

    .line 511
    .line 512
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 513
    .line 514
    .line 515
    throw p0

    .line 516
    :cond_12
    new-instance p0, Ljava/lang/NullPointerException;

    .line 517
    .line 518
    const-string p1, "A null argument was passed to handle challenge."

    .line 519
    .line 520
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 521
    .line 522
    .line 523
    throw p0
    :try_end_3
    .catch Landroid/javax/sip/SipException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 524
    :catch_1
    move-exception v0

    .line 525
    move-object p0, v0

    .line 526
    sget-object p1, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 527
    .line 528
    const-string p2, "Unexpected exception "

    .line 529
    .line 530
    invoke-interface {p1, p2, p0}, Landroid/gov/nist/core/StackLogger;->logError(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 531
    .line 532
    .line 533
    new-instance p1, Landroid/javax/sip/SipException;

    .line 534
    .line 535
    invoke-direct {p1, p2, p0}, Landroid/javax/sip/SipException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 536
    .line 537
    .line 538
    throw p1

    .line 539
    :catch_2
    move-exception v0

    .line 540
    move-object p0, v0

    .line 541
    throw p0
.end method

.method public removeCachedAuthenticationHeaders(Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->cachedCredentials:Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache;->removeAuthenticationHeader(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "Null callId argument "

    .line 10
    .line 11
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setAuthenticationHeaders(Landroid/javax/sip/message/Request;)V
    .locals 2

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Landroid/gov/nist/javax/sip/message/SIPRequest;

    .line 3
    .line 4
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/message/SIPMessage;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-interface {v0}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "Authorization"

    .line 13
    .line 14
    invoke-interface {p1, v1}, Landroid/javax/sip/message/Message;->removeHeader(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->cachedCredentials:Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/gov/nist/javax/sip/clientauthutils/CredentialsCache;->getCachedAuthorizationHeaders(Ljava/lang/String;)Ljava/util/Collection;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    sget-object p0, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 26
    .line 27
    const/16 p1, 0x20

    .line 28
    .line 29
    invoke-interface {p0, p1}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    sget-object p0, Landroid/gov/nist/javax/sip/clientauthutils/AuthenticationHelperImpl;->logger:Landroid/gov/nist/core/StackLogger;

    .line 36
    .line 37
    const-string p1, "Could not find authentication headers for "

    .line 38
    .line 39
    invoke-static {p1, v0, p0}, La/b1j;->x(Ljava/lang/String;Ljava/lang/String;Landroid/gov/nist/core/StackLogger;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Landroid/javax/sip/header/AuthorizationHeader;

    .line 58
    .line 59
    invoke-interface {p1, v0}, Landroid/javax/sip/message/Message;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    return-void
.end method
