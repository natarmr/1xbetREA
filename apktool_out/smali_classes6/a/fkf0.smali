.class public final synthetic La/fkf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ma80;

.field public final synthetic c:La/ekf0;


# direct methods
.method public synthetic constructor <init>(La/ma80;La/ekf0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/fkf0;->a:B

    iput-object p1, p0, La/fkf0;->b:La/ma80;

    iput-object p2, p0, La/fkf0;->c:La/ekf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/fkf0;->a:B

    .line 2
    .line 3
    const-wide v1, 0xffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/16 v4, 0x20

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    iget-object v6, p0, La/fkf0;->c:La/ekf0;

    .line 13
    .line 14
    iget-object p0, p0, La/fkf0;->b:La/ma80;

    .line 15
    .line 16
    check-cast p1, La/uag0;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    if-ne p0, v5, :cond_0

    .line 31
    .line 32
    iget-object p0, v6, La/ekf0;->r:La/t33;

    .line 33
    .line 34
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/ne60;

    .line 39
    .line 40
    iget-wide v0, p0, La/ne60;->a:J

    .line 41
    .line 42
    shr-long/2addr v0, v4

    .line 43
    long-to-int p0, v0

    .line 44
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-virtual {p1, p0}, La/uag0;->H(F)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    iget-object p0, v6, La/ekf0;->r:La/t33;

    .line 57
    .line 58
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, La/ne60;

    .line 63
    .line 64
    iget-wide v3, p0, La/ne60;->a:J

    .line 65
    .line 66
    and-long v0, v3, v1

    .line 67
    .line 68
    long-to-int p0, v0

    .line 69
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    invoke-virtual {p1, p0}, La/uag0;->I(F)V

    .line 74
    .line 75
    .line 76
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    :goto_1
    return-object v3

    .line 79
    :pswitch_0
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-eqz p0, :cond_3

    .line 84
    .line 85
    if-ne p0, v5, :cond_2

    .line 86
    .line 87
    invoke-virtual {v6}, La/ekf0;->c()J

    .line 88
    .line 89
    .line 90
    move-result-wide v0

    .line 91
    shr-long/2addr v0, v4

    .line 92
    long-to-int p0, v0

    .line 93
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    invoke-virtual {p1, p0}, La/uag0;->H(F)V

    .line 98
    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_3
    invoke-virtual {v6}, La/ekf0;->c()J

    .line 106
    .line 107
    .line 108
    move-result-wide v3

    .line 109
    and-long v0, v3, v1

    .line 110
    .line 111
    long-to-int p0, v0

    .line 112
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    invoke-virtual {p1, p0}, La/uag0;->I(F)V

    .line 117
    .line 118
    .line 119
    :goto_2
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    :goto_3
    return-object v3

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
