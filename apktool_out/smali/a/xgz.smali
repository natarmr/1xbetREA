.class public final synthetic La/xgz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/l7m0;

.field public final synthetic d:La/xcz;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/l7m0;La/xcz;Lkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/xgz;->a:B

    iput-object p1, p0, La/xgz;->b:La/l7m0;

    iput-object p2, p0, La/xgz;->c:La/l7m0;

    iput-object p3, p0, La/xgz;->d:La/xcz;

    iput-object p4, p0, La/xgz;->e:Lkotlin/jvm/functions/Function1;

    iput p5, p0, La/xgz;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/xgz;->a:B

    .line 2
    .line 3
    iget v1, p0, La/xgz;->f:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v6, p1

    .line 9
    check-cast v6, La/fet;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    or-int/lit8 p1, v1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, La/x8x;->L(I)I

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    iget-object v2, p0, La/xgz;->b:La/l7m0;

    .line 23
    .line 24
    iget-object v3, p0, La/xgz;->c:La/l7m0;

    .line 25
    .line 26
    iget-object v4, p0, La/xgz;->d:La/xcz;

    .line 27
    .line 28
    iget-object v5, p0, La/xgz;->e:Lkotlin/jvm/functions/Function1;

    .line 29
    .line 30
    invoke-static/range {v2 .. v7}, La/y9a;->K(La/l7m0;La/l7m0;La/xcz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    move-object v4, p1

    .line 37
    check-cast v4, La/fet;

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    or-int/lit8 p1, v1, 0x1

    .line 45
    .line 46
    invoke-static {p1}, La/x8x;->L(I)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    iget-object v0, p0, La/xgz;->b:La/l7m0;

    .line 51
    .line 52
    iget-object v1, p0, La/xgz;->c:La/l7m0;

    .line 53
    .line 54
    iget-object v2, p0, La/xgz;->d:La/xcz;

    .line 55
    .line 56
    iget-object v3, p0, La/xgz;->e:Lkotlin/jvm/functions/Function1;

    .line 57
    .line 58
    invoke-static/range {v0 .. v5}, La/ny9;->E(La/l7m0;La/l7m0;La/xcz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_1
    move-object v4, p1

    .line 65
    check-cast v4, La/fet;

    .line 66
    .line 67
    check-cast p2, Ljava/lang/Integer;

    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 70
    .line 71
    .line 72
    or-int/lit8 p1, v1, 0x1

    .line 73
    .line 74
    invoke-static {p1}, La/x8x;->L(I)I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    iget-object v0, p0, La/xgz;->b:La/l7m0;

    .line 79
    .line 80
    iget-object v1, p0, La/xgz;->c:La/l7m0;

    .line 81
    .line 82
    iget-object v2, p0, La/xgz;->d:La/xcz;

    .line 83
    .line 84
    iget-object v3, p0, La/xgz;->e:Lkotlin/jvm/functions/Function1;

    .line 85
    .line 86
    invoke-static/range {v0 .. v5}, La/f1t0;->F(La/l7m0;La/l7m0;La/xcz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 87
    .line 88
    .line 89
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0

    .line 92
    :pswitch_2
    move-object v4, p1

    .line 93
    check-cast v4, La/fet;

    .line 94
    .line 95
    check-cast p2, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    or-int/lit8 p1, v1, 0x1

    .line 101
    .line 102
    invoke-static {p1}, La/x8x;->L(I)I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    iget-object v0, p0, La/xgz;->b:La/l7m0;

    .line 107
    .line 108
    iget-object v1, p0, La/xgz;->c:La/l7m0;

    .line 109
    .line 110
    iget-object v2, p0, La/xgz;->d:La/xcz;

    .line 111
    .line 112
    iget-object v3, p0, La/xgz;->e:Lkotlin/jvm/functions/Function1;

    .line 113
    .line 114
    invoke-static/range {v0 .. v5}, La/eeq;->D(La/l7m0;La/l7m0;La/xcz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 115
    .line 116
    .line 117
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_3
    move-object v4, p1

    .line 121
    check-cast v4, La/fet;

    .line 122
    .line 123
    check-cast p2, Ljava/lang/Integer;

    .line 124
    .line 125
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 126
    .line 127
    .line 128
    or-int/lit8 p1, v1, 0x1

    .line 129
    .line 130
    invoke-static {p1}, La/x8x;->L(I)I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    iget-object v0, p0, La/xgz;->b:La/l7m0;

    .line 135
    .line 136
    iget-object v1, p0, La/xgz;->c:La/l7m0;

    .line 137
    .line 138
    iget-object v2, p0, La/xgz;->d:La/xcz;

    .line 139
    .line 140
    iget-object v3, p0, La/xgz;->e:Lkotlin/jvm/functions/Function1;

    .line 141
    .line 142
    invoke-static/range {v0 .. v5}, La/y860;->Q(La/l7m0;La/l7m0;La/xcz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 143
    .line 144
    .line 145
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    return-object p0

    .line 148
    nop

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
