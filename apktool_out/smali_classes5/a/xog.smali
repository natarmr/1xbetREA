.class public final La/xog;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vj50;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xog;->a:B

    iput-object p1, p0, La/xog;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final C(IJ)J
    .locals 6

    .line 1
    iget-byte p1, p0, La/xog;->a:B

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-wide v4, 0xffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/xog;->b:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch p1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p0, La/dmg0;

    .line 19
    .line 20
    and-long p1, p2, v4

    .line 21
    .line 22
    long-to-int p1, p1

    .line 23
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    cmpl-float p2, p2, v3

    .line 28
    .line 29
    if-gez p2, :cond_1

    .line 30
    .line 31
    iget-object p2, p0, La/dmg0;->c:Lkotlin/jvm/functions/Function0;

    .line 32
    .line 33
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    check-cast p2, Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-nez p2, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-virtual {p0, p1}, La/dmg0;->a(F)F

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    int-to-long p1, p1

    .line 59
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    int-to-long v0, p0

    .line 64
    shl-long p0, p1, v2

    .line 65
    .line 66
    and-long p2, v0, v4

    .line 67
    .line 68
    or-long v0, p0, p2

    .line 69
    .line 70
    :cond_1
    :goto_0
    return-wide v0

    .line 71
    :pswitch_0
    and-long p1, p2, v4

    .line 72
    .line 73
    long-to-int p1, p1

    .line 74
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    cmpl-float p2, p2, v3

    .line 79
    .line 80
    if-ltz p2, :cond_2

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    check-cast p0, La/yog;

    .line 84
    .line 85
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    invoke-virtual {p0, p1}, La/yog;->a(F)F

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    int-to-long p1, p1

    .line 98
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    int-to-long v0, p0

    .line 103
    shl-long p0, p1, v2

    .line 104
    .line 105
    and-long p2, v0, v4

    .line 106
    .line 107
    or-long v0, p0, p2

    .line 108
    .line 109
    :goto_1
    return-wide v0

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final S(IJJ)J
    .locals 4

    .line 1
    iget-byte p1, p0, La/xog;->a:B

    .line 2
    .line 3
    const/16 p2, 0x20

    .line 4
    .line 5
    iget-object p0, p0, La/xog;->b:Ljava/lang/Object;

    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    const/4 p3, 0x0

    .line 10
    const-wide v2, 0xffffffffL

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    packed-switch p1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    and-long/2addr p4, v2

    .line 19
    long-to-int p1, p4

    .line 20
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 21
    .line 22
    .line 23
    move-result p4

    .line 24
    cmpg-float p4, p4, p3

    .line 25
    .line 26
    if-gtz p4, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    check-cast p0, La/dmg0;

    .line 30
    .line 31
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    invoke-virtual {p0, p1}, La/dmg0;->a(F)F

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    int-to-long p3, p1

    .line 44
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    int-to-long p0, p0

    .line 49
    shl-long p2, p3, p2

    .line 50
    .line 51
    and-long/2addr p0, v2

    .line 52
    or-long v0, p2, p0

    .line 53
    .line 54
    :goto_0
    return-wide v0

    .line 55
    :pswitch_0
    and-long/2addr p4, v2

    .line 56
    long-to-int p1, p4

    .line 57
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 58
    .line 59
    .line 60
    move-result p4

    .line 61
    cmpg-float p4, p4, p3

    .line 62
    .line 63
    if-gtz p4, :cond_1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    check-cast p0, La/yog;

    .line 67
    .line 68
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    invoke-virtual {p0, p1}, La/yog;->a(F)F

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    int-to-long p3, p1

    .line 81
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    int-to-long p0, p0

    .line 86
    shl-long p2, p3, p2

    .line 87
    .line 88
    and-long/2addr p0, v2

    .line 89
    or-long v0, p2, p0

    .line 90
    .line 91
    :goto_1
    return-wide v0

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
