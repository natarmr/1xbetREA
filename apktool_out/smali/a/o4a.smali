.class public final La/o4a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/g45;


# direct methods
.method public synthetic constructor <init>(La/g45;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/o4a;->a:La/g45;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/q4f;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/4 v0, 0x1

    .line 9
    if-eq p1, v0, :cond_2

    .line 10
    .line 11
    const/4 v0, 0x3

    .line 12
    if-eq p1, v0, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x5

    .line 15
    if-eq p1, v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x6

    .line 18
    const/16 v1, 0x32

    .line 19
    .line 20
    if-eq p1, v0, :cond_0

    .line 21
    .line 22
    packed-switch p1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, La/o4a;->a:La/g45;

    .line 26
    .line 27
    iget-object p0, p0, La/g45;->e:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, La/vwb0;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, La/vwb0;->b()Landroid/content/SharedPreferences;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const-string p1, "max_coupon_size_key"

    .line 39
    .line 40
    invoke-interface {p0, p1, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    return p0

    .line 45
    :pswitch_0
    const/16 p0, 0xf

    .line 46
    .line 47
    return p0

    .line 48
    :pswitch_1
    const/16 p0, 0x1e

    .line 49
    .line 50
    return p0

    .line 51
    :pswitch_2
    const/16 p0, 0x8

    .line 52
    .line 53
    return p0

    .line 54
    :cond_0
    return v1

    .line 55
    :cond_1
    const/16 p0, 0x14

    .line 56
    .line 57
    return p0

    .line 58
    :cond_2
    return v0

    .line 59
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object p0, p0, La/o4a;->a:La/g45;

    .line 2
    .line 3
    iget-object p0, p0, La/g45;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/q7d0;

    .line 6
    .line 7
    const-string v0, "COUPON_KEY_PREFERENCE"

    .line 8
    .line 9
    invoke-static {p0, v0}, La/q7d0;->c(La/q7d0;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const-string p0, ""

    .line 16
    .line 17
    :cond_0
    return-object p0
.end method
