.class public final La/fl70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xsy;


# direct methods
.method public static b(La/fza0;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {}, La/t9f;->b()V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :pswitch_0
    const p0, 0x7f1310d7

    .line 14
    .line 15
    .line 16
    return p0

    .line 17
    :pswitch_1
    const p0, 0x7f1307f1

    .line 18
    .line 19
    .line 20
    return p0

    .line 21
    :pswitch_2
    const p0, 0x7f130dd9

    .line 22
    .line 23
    .line 24
    return p0

    .line 25
    :pswitch_3
    const p0, 0x7f1315d6

    .line 26
    .line 27
    .line 28
    return p0

    .line 29
    :pswitch_4
    const p0, 0x7f130b3b

    .line 30
    .line 31
    .line 32
    return p0

    .line 33
    :pswitch_5
    const p0, 0x7f1312e7

    .line 34
    .line 35
    .line 36
    return p0

    .line 37
    :pswitch_6
    const p0, 0x7f130fc2

    .line 38
    .line 39
    .line 40
    return p0

    .line 41
    :pswitch_7
    const p0, 0x7f130792

    .line 42
    .line 43
    .line 44
    return p0

    .line 45
    :pswitch_8
    const p0, 0x7f13015a

    .line 46
    .line 47
    .line 48
    return p0

    .line 49
    :pswitch_9
    const p0, 0x7f130b3c

    .line 50
    .line 51
    .line 52
    return p0

    .line 53
    :pswitch_a
    const p0, 0x7f1300d5

    .line 54
    .line 55
    .line 56
    return p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static c(DDDDZZD)Z
    .locals 0

    .line 1
    cmpg-double p4, p4, p2

    .line 2
    .line 3
    if-gtz p4, :cond_0

    .line 4
    .line 5
    cmpg-double p4, p2, p6

    .line 6
    .line 7
    if-gtz p4, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    cmpg-double p2, p2, p10

    .line 11
    .line 12
    if-nez p2, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    if-nez p8, :cond_2

    .line 16
    .line 17
    if-eqz p9, :cond_3

    .line 18
    .line 19
    :cond_2
    :goto_0
    const-wide/16 p2, 0x0

    .line 20
    .line 21
    cmpl-double p0, p0, p2

    .line 22
    .line 23
    if-lez p0, :cond_3

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_3
    const/4 p0, 0x0

    .line 28
    return p0
.end method


# virtual methods
.method public a(La/iys0;La/iys0;)Z
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method
