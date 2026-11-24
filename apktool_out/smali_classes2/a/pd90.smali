.class public abstract La/pd90;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/regex/Pattern;

.field public static final b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, La/pd90;->a:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    const/4 v0, 0x6

    .line 10
    invoke-static {v0}, La/hne;->H(I)[I

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, La/pd90;->b:[I

    .line 15
    .line 16
    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_4

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_4

    .line 8
    .line 9
    if-eqz p1, :cond_3

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/16 v1, 0x28

    .line 22
    .line 23
    if-gt v0, v1, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    const/16 v0, 0x64

    .line 30
    .line 31
    if-gt p1, v0, :cond_1

    .line 32
    .line 33
    sget-object p1, La/pd90;->a:Ljava/util/regex/Pattern;

    .line 34
    .line 35
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    return-void

    .line 46
    :cond_0
    const-string p0, "Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_"

    .line 47
    .line 48
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 53
    .line 54
    const-string p0, "Attribute value length must not exceed 100 characters"

    .line 55
    .line 56
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 61
    .line 62
    const-string p0, "Attribute key length must not exceed 40 characters"

    .line 63
    .line 64
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_3
    const-string p0, "Attribute value must not be null or empty"

    .line 69
    .line 70
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_4
    const-string p0, "Attribute key must not be null or empty"

    .line 75
    .line 76
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, "Metric name must not be null"

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x64

    .line 11
    .line 12
    if-le v0, v1, :cond_1

    .line 13
    .line 14
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 15
    .line 16
    const-string p0, "Metric name must not exceed 100 characters"

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    const-string v0, "_"

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v1, 0x0

    .line 26
    if-eqz v0, :cond_4

    .line 27
    .line 28
    sget-object v0, La/pd90;->b:[I

    .line 29
    .line 30
    array-length v2, v0

    .line 31
    const/4 v3, 0x0

    .line 32
    :goto_0
    if-ge v3, v2, :cond_3

    .line 33
    .line 34
    aget v4, v0, v3

    .line 35
    .line 36
    packed-switch v4, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    throw v1

    .line 40
    :pswitch_0
    const-string v4, "_fr_fzn"

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :pswitch_1
    const-string v4, "_fr_slo"

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :pswitch_2
    const-string v4, "_fr_tot"

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :pswitch_3
    const-string v4, "_tsns"

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :pswitch_4
    const-string v4, "_fsntc"

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :pswitch_5
    const-string v4, "_fstec"

    .line 56
    .line 57
    :goto_1
    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_2

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_3
    const-string p0, "Metric name must not start with \'_\'"

    .line 68
    .line 69
    return-object p0

    .line 70
    :cond_4
    :goto_2
    return-object v1

    .line 71
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public abstract a()Z
.end method
