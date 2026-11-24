.class public Landroid/gov/nist/javax/sip/address/AddressFactoryImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/gov/nist/javax/sip/address/AddressFactoryEx;


# static fields
.field public static final SCHEME_PATTERN:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "\\p{Alpha}[[{\\p{Alpha}][\\p{Digit}][\\+][-][\\.]]*"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Landroid/gov/nist/javax/sip/address/AddressFactoryImpl;->SCHEME_PATTERN:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public createAddress()Landroid/javax/sip/address/Address;
    .locals 0

    .line 56
    new-instance p0, Landroid/gov/nist/javax/sip/address/AddressImpl;

    invoke-direct {p0}, Landroid/gov/nist/javax/sip/address/AddressImpl;-><init>()V

    return-object p0
.end method

.method public createAddress(Landroid/javax/sip/address/URI;)Landroid/javax/sip/address/Address;
    .locals 0

    if-eqz p1, :cond_0

    .line 53
    new-instance p0, Landroid/gov/nist/javax/sip/address/AddressImpl;

    invoke-direct {p0}, Landroid/gov/nist/javax/sip/address/AddressImpl;-><init>()V

    .line 54
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/address/AddressImpl;->setURI(Landroid/javax/sip/address/URI;)V

    return-object p0

    .line 55
    :cond_0
    const-string p0, "null address"

    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public createAddress(Ljava/lang/String;)Landroid/javax/sip/address/Address;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const-string p0, "*"

    .line 4
    .line 5
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance p1, Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 12
    .line 13
    invoke-direct {p1}, Landroid/gov/nist/javax/sip/address/AddressImpl;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x3

    .line 17
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/address/AddressImpl;->setAddressType(I)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Landroid/gov/nist/javax/sip/address/SipUri;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/address/SipUri;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, p0}, Landroid/javax/sip/address/SipURI;->setUser(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/gov/nist/javax/sip/address/AddressImpl;->setURI(Landroid/javax/sip/address/URI;)V

    .line 29
    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_0
    new-instance p0, Landroid/gov/nist/javax/sip/parser/StringMsgParser;

    .line 33
    .line 34
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/parser/StringMsgParser;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/parser/StringMsgParser;->parseAddress(Ljava/lang/String;)Landroid/gov/nist/javax/sip/address/AddressImpl;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :cond_1
    const-string p0, "null address"

    .line 43
    .line 44
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0
.end method

.method public createAddress(Ljava/lang/String;Landroid/javax/sip/address/URI;)Landroid/javax/sip/address/Address;
    .locals 0

    if-eqz p2, :cond_1

    .line 49
    new-instance p0, Landroid/gov/nist/javax/sip/address/AddressImpl;

    invoke-direct {p0}, Landroid/gov/nist/javax/sip/address/AddressImpl;-><init>()V

    if-eqz p1, :cond_0

    .line 50
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/address/AddressImpl;->setDisplayName(Ljava/lang/String;)V

    .line 51
    :cond_0
    invoke-virtual {p0, p2}, Landroid/gov/nist/javax/sip/address/AddressImpl;->setURI(Landroid/javax/sip/address/URI;)V

    return-object p0

    .line 52
    :cond_1
    const-string p0, "null  URI"

    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public createSipURI(Ljava/lang/String;)Landroid/javax/sip/address/SipURI;
    .locals 1

    const/4 p0, 0x0

    if-eqz p1, :cond_0

    .line 81
    :try_start_0
    new-instance v0, Landroid/gov/nist/javax/sip/parser/StringMsgParser;

    invoke-direct {v0}, Landroid/gov/nist/javax/sip/parser/StringMsgParser;-><init>()V

    .line 82
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/parser/StringMsgParser;->parseSIPUrl(Ljava/lang/String;)Landroid/gov/nist/javax/sip/address/SipUri;

    move-result-object p0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    .line 83
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, La/hny;->j(ILjava/lang/String;)V

    return-object p0

    .line 84
    :cond_0
    const-string p1, "null URI"

    invoke-static {p1}, La/hny;->u(Ljava/lang/String;)V

    return-object p0
.end method

.method public createSipURI(Ljava/lang/String;Ljava/lang/String;)Landroid/javax/sip/address/SipURI;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_2

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const-string v2, "sip:"

    .line 7
    .line 8
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string p1, "@"

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    :cond_0
    const/16 p1, 0x3a

    .line 22
    .line 23
    invoke-virtual {p2, p1}, Ljava/lang/String;->indexOf(I)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    invoke-virtual {p2, p1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/4 v3, 0x0

    .line 32
    if-eq v2, p1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    const/16 v2, 0x5b

    .line 43
    .line 44
    if-eq p1, v2, :cond_1

    .line 45
    .line 46
    const-string p1, "["

    .line 47
    .line 48
    const/16 v2, 0x5d

    .line 49
    .line 50
    invoke-static {v2, p1, p2}, La/hne;->l(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    :cond_1
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/address/AddressFactoryImpl;->createSipURI(Ljava/lang/String;)Landroid/javax/sip/address/SipURI;

    .line 62
    .line 63
    .line 64
    move-result-object p0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    return-object p0

    .line 66
    :catch_0
    move-exception p0

    .line 67
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-static {v3, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_2
    const-string p0, "null host"

    .line 76
    .line 77
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-object v0
.end method

.method public createTelURL(Ljava/lang/String;)Landroid/javax/sip/address/TelURL;
    .locals 2

    .line 1
    const/4 p0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    const-string v0, "tel:"

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    :try_start_0
    new-instance v0, Landroid/gov/nist/javax/sip/parser/StringMsgParser;

    .line 18
    .line 19
    invoke-direct {v0}, Landroid/gov/nist/javax/sip/parser/StringMsgParser;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Landroid/gov/nist/javax/sip/parser/StringMsgParser;->parseUrl(Ljava/lang/String;)Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Landroid/gov/nist/javax/sip/address/TelURLImpl;
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    return-object p1

    .line 29
    :catch_0
    move-exception p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-static {v0, p1}, La/hny;->j(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_1
    const-string p1, "null url"

    .line 40
    .line 41
    invoke-static {p1}, La/hny;->u(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object p0
.end method

.method public createURI(Ljava/lang/String;)Landroid/javax/sip/address/URI;
    .locals 5

    .line 1
    const-string v0, "the scheme "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_5

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    :try_start_0
    new-instance v3, Landroid/gov/nist/javax/sip/parser/URLParser;

    .line 8
    .line 9
    invoke-direct {v3, p1}, Landroid/gov/nist/javax/sip/parser/URLParser;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v3}, Landroid/gov/nist/javax/sip/parser/URLParser;->peekScheme()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-eqz v3, :cond_4

    .line 17
    .line 18
    const-string v4, "sip"

    .line 19
    .line 20
    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-nez v4, :cond_3

    .line 25
    .line 26
    const-string v4, "sips"

    .line 27
    .line 28
    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const-string v4, "tel"

    .line 36
    .line 37
    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/address/AddressFactoryImpl;->createTelURL(Ljava/lang/String;)Landroid/javax/sip/address/TelURL;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :catch_0
    move-exception p0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    sget-object p0, Landroid/gov/nist/javax/sip/address/AddressFactoryImpl;->SCHEME_PATTERN:Ljava/util/regex/Pattern;

    .line 51
    .line 52
    invoke-virtual {p0, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 57
    .line 58
    .line 59
    move-result p0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 60
    if-eqz p0, :cond_2

    .line 61
    .line 62
    new-instance p0, Landroid/gov/nist/javax/sip/address/GenericURI;

    .line 63
    .line 64
    invoke-direct {p0, p1}, Landroid/gov/nist/javax/sip/address/GenericURI;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_2
    :try_start_1
    new-instance p0, Ljava/text/ParseException;

    .line 69
    .line 70
    new-instance v4, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v0, " from the following uri "

    .line 79
    .line 80
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string p1, " doesn\'t match ALPHA *(ALPHA / DIGIT / \"+\" / \"-\" / \".\" ) from RFC3261"

    .line 87
    .line 88
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-direct {p0, p1, v2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    .line 96
    .line 97
    .line 98
    throw p0

    .line 99
    :cond_3
    :goto_0
    invoke-virtual {p0, p1}, Landroid/gov/nist/javax/sip/address/AddressFactoryImpl;->createSipURI(Ljava/lang/String;)Landroid/javax/sip/address/SipURI;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0

    .line 104
    :cond_4
    new-instance p0, Ljava/text/ParseException;

    .line 105
    .line 106
    const-string p1, "bad scheme"

    .line 107
    .line 108
    invoke-direct {p0, p1, v2}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    .line 109
    .line 110
    .line 111
    throw p0
    :try_end_1
    .catch Ljava/text/ParseException; {:try_start_1 .. :try_end_1} :catch_0

    .line 112
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-static {v2, p0}, La/hny;->j(ILjava/lang/String;)V

    .line 117
    .line 118
    .line 119
    return-object v1

    .line 120
    :cond_5
    const-string p0, "null arg"

    .line 121
    .line 122
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    return-object v1
.end method
