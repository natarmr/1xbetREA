.class public final synthetic La/rvl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a4x;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:La/u23;


# direct methods
.method public synthetic constructor <init>(La/a4x;Ljava/lang/String;La/u23;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/rvl0;->a:B

    iput-object p1, p0, La/rvl0;->b:La/a4x;

    iput-object p2, p0, La/rvl0;->c:Ljava/lang/String;

    iput-object p3, p0, La/rvl0;->d:La/u23;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/rvl0;->a:B

    .line 2
    .line 3
    const v1, 0x799532c4

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x3

    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, p0, La/rvl0;->d:La/u23;

    .line 9
    .line 10
    iget-object v5, p0, La/rvl0;->c:Ljava/lang/String;

    .line 11
    .line 12
    iget-object p0, p0, La/rvl0;->b:La/a4x;

    .line 13
    .line 14
    const/4 v6, 0x1

    .line 15
    check-cast p1, La/hcz;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    new-instance v0, La/h0;

    .line 24
    .line 25
    const/16 v7, 0x9

    .line 26
    .line 27
    invoke-direct {v0, v5, v7}, La/h0;-><init>(Ljava/lang/String;B)V

    .line 28
    .line 29
    .line 30
    new-instance v5, La/ugd;

    .line 31
    .line 32
    const v7, 0x5732a0e9

    .line 33
    .line 34
    .line 35
    invoke-direct {v5, v7, v6, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1, v3, v3, v5, v2}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 39
    .line 40
    .line 41
    new-instance v0, La/gcl0;

    .line 42
    .line 43
    const/16 v2, 0x16

    .line 44
    .line 45
    invoke-direct {v0, v2}, La/gcl0;-><init>(B)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    new-instance v5, La/o3l0;

    .line 53
    .line 54
    invoke-direct {v5, v0, p0, v2}, La/o3l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 55
    .line 56
    .line 57
    new-instance v0, La/y9k0;

    .line 58
    .line 59
    const/16 v2, 0x18

    .line 60
    .line 61
    invoke-direct {v0, p0, v2}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 62
    .line 63
    .line 64
    new-instance v2, La/vvl0;

    .line 65
    .line 66
    invoke-direct {v2, p0, p0, v4, v6}, La/vvl0;-><init>(Ljava/util/List;La/a4x;La/u23;B)V

    .line 67
    .line 68
    .line 69
    new-instance p0, La/ugd;

    .line 70
    .line 71
    invoke-direct {p0, v1, v6, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v3, v5, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 75
    .line 76
    .line 77
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object p0

    .line 80
    :pswitch_0
    new-instance v0, La/h0;

    .line 81
    .line 82
    const/16 v7, 0x8

    .line 83
    .line 84
    invoke-direct {v0, v5, v7}, La/h0;-><init>(Ljava/lang/String;B)V

    .line 85
    .line 86
    .line 87
    new-instance v5, La/ugd;

    .line 88
    .line 89
    const v7, -0x61d1e39f

    .line 90
    .line 91
    .line 92
    invoke-direct {v5, v7, v6, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-static {p1, v3, v3, v5, v2}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 96
    .line 97
    .line 98
    new-instance v0, La/gcl0;

    .line 99
    .line 100
    const/16 v2, 0x15

    .line 101
    .line 102
    invoke-direct {v0, v2}, La/gcl0;-><init>(B)V

    .line 103
    .line 104
    .line 105
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    new-instance v5, La/o3l0;

    .line 110
    .line 111
    invoke-direct {v5, v0, p0, v2}, La/o3l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 112
    .line 113
    .line 114
    new-instance v0, La/y9k0;

    .line 115
    .line 116
    const/16 v2, 0x17

    .line 117
    .line 118
    invoke-direct {v0, p0, v2}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 119
    .line 120
    .line 121
    new-instance v2, La/vvl0;

    .line 122
    .line 123
    const/4 v7, 0x0

    .line 124
    invoke-direct {v2, p0, p0, v4, v7}, La/vvl0;-><init>(Ljava/util/List;La/a4x;La/u23;B)V

    .line 125
    .line 126
    .line 127
    new-instance p0, La/ugd;

    .line 128
    .line 129
    invoke-direct {p0, v1, v6, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v3, v5, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 133
    .line 134
    .line 135
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object p0

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
