.class public final synthetic La/gjj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:La/pz40;

.field public final synthetic d:La/pz40;


# direct methods
.method public synthetic constructor <init>(JLa/pz40;La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/gjj;->a:B

    iput-wide p1, p0, La/gjj;->b:J

    iput-object p3, p0, La/gjj;->c:La/pz40;

    iput-object p4, p0, La/gjj;->d:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/gjj;->a:B

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    const-wide v2, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    iget-object v4, p0, La/gjj;->d:La/pz40;

    .line 11
    .line 12
    iget-object v5, p0, La/gjj;->c:La/pz40;

    .line 13
    .line 14
    iget-wide v6, p0, La/gjj;->b:J

    .line 15
    .line 16
    check-cast p1, La/w6k;

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, La/ne60;

    .line 29
    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    iget-wide p0, p0, La/ne60;->a:J

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, La/qkx;

    .line 40
    .line 41
    iget-wide p0, p0, La/qkx;->a:J

    .line 42
    .line 43
    invoke-static {v6, v7, p0, p1}, La/p8a;->X(JJ)J

    .line 44
    .line 45
    .line 46
    move-result-wide p0

    .line 47
    :goto_0
    shr-long v4, p0, v1

    .line 48
    .line 49
    long-to-int v0, v4

    .line 50
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-static {v0}, La/si30;->b(F)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    and-long/2addr p0, v2

    .line 59
    long-to-int p0, p0

    .line 60
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    invoke-static {p0}, La/si30;->b(F)I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    int-to-long v4, v0

    .line 69
    shl-long v0, v4, v1

    .line 70
    .line 71
    int-to-long p0, p0

    .line 72
    and-long/2addr p0, v2

    .line 73
    or-long/2addr p0, v0

    .line 74
    new-instance v0, La/ikx;

    .line 75
    .line 76
    invoke-direct {v0, p0, p1}, La/ikx;-><init>(J)V

    .line 77
    .line 78
    .line 79
    return-object v0

    .line 80
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, La/ne60;

    .line 88
    .line 89
    if-eqz p0, :cond_1

    .line 90
    .line 91
    iget-wide p0, p0, La/ne60;->a:J

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    check-cast p0, La/qkx;

    .line 99
    .line 100
    iget-wide p0, p0, La/qkx;->a:J

    .line 101
    .line 102
    invoke-static {v6, v7, p0, p1}, La/jjj;->e(JJ)J

    .line 103
    .line 104
    .line 105
    move-result-wide p0

    .line 106
    :goto_1
    shr-long v4, p0, v1

    .line 107
    .line 108
    long-to-int v0, v4

    .line 109
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-static {v0}, La/si30;->b(F)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    and-long/2addr p0, v2

    .line 118
    long-to-int p0, p0

    .line 119
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    invoke-static {p0}, La/si30;->b(F)I

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    int-to-long v4, v0

    .line 128
    shl-long v0, v4, v1

    .line 129
    .line 130
    int-to-long p0, p0

    .line 131
    and-long/2addr p0, v2

    .line 132
    or-long/2addr p0, v0

    .line 133
    new-instance v0, La/ikx;

    .line 134
    .line 135
    invoke-direct {v0, p0, p1}, La/ikx;-><init>(J)V

    .line 136
    .line 137
    .line 138
    return-object v0

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
