.class public final synthetic La/cec0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:F

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/kec0;FFLa/hjm;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/cec0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/cec0;->e:Ljava/lang/Object;

    iput p2, p0, La/cec0;->b:F

    iput p3, p0, La/cec0;->d:F

    iput-object p4, p0, La/cec0;->f:Ljava/lang/Object;

    iput-object p5, p0, La/cec0;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(La/pz40;FLjava/util/Map;Lkotlin/jvm/functions/Function1;F)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/cec0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/cec0;->e:Ljava/lang/Object;

    iput p2, p0, La/cec0;->b:F

    iput-object p3, p0, La/cec0;->f:Ljava/lang/Object;

    iput-object p4, p0, La/cec0;->c:Lkotlin/jvm/functions/Function1;

    iput p5, p0, La/cec0;->d:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/cec0;->a:B

    .line 2
    .line 3
    const v1, 0x799532c4

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, La/cec0;->f:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v3, p0, La/cec0;->e:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    const/4 v5, 0x2

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object v12, v3

    .line 16
    check-cast v12, La/pz40;

    .line 17
    .line 18
    move-object v9, v2

    .line 19
    check-cast v9, Ljava/util/Map;

    .line 20
    .line 21
    check-cast p1, La/hcz;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    move-object v7, v0

    .line 31
    check-cast v7, La/a4x;

    .line 32
    .line 33
    new-instance v0, La/k8e0;

    .line 34
    .line 35
    const/16 v2, 0x13

    .line 36
    .line 37
    invoke-direct {v0, v2}, La/k8e0;-><init>(B)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    new-instance v3, La/pwe0;

    .line 45
    .line 46
    invoke-direct {v3, v0, v7, v5}, La/pwe0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    new-instance v0, La/ubn;

    .line 50
    .line 51
    const/16 v5, 0x18

    .line 52
    .line 53
    invoke-direct {v0, v7, v5}, La/ubn;-><init>(La/a4x;B)V

    .line 54
    .line 55
    .line 56
    new-instance v6, La/s3f0;

    .line 57
    .line 58
    iget v8, p0, La/cec0;->b:F

    .line 59
    .line 60
    iget-object v10, p0, La/cec0;->c:Lkotlin/jvm/functions/Function1;

    .line 61
    .line 62
    iget v11, p0, La/cec0;->d:F

    .line 63
    .line 64
    invoke-direct/range {v6 .. v12}, La/s3f0;-><init>(La/a4x;FLjava/util/Map;Lkotlin/jvm/functions/Function1;FLa/pz40;)V

    .line 65
    .line 66
    .line 67
    new-instance p0, La/ugd;

    .line 68
    .line 69
    invoke-direct {p0, v1, v4, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v2, v3, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 73
    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_0
    check-cast v3, La/kec0;

    .line 79
    .line 80
    check-cast v2, La/hjm;

    .line 81
    .line 82
    check-cast p1, La/hcz;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v0, La/h7m;

    .line 88
    .line 89
    iget v6, p0, La/cec0;->b:F

    .line 90
    .line 91
    invoke-direct {v0, v6, v3, v5}, La/h7m;-><init>(FLjava/lang/Object;B)V

    .line 92
    .line 93
    .line 94
    new-instance v7, La/ugd;

    .line 95
    .line 96
    const v8, 0x379dde77

    .line 97
    .line 98
    .line 99
    invoke-direct {v7, v8, v4, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    const/4 v8, 0x3

    .line 104
    invoke-static {p1, v0, v0, v7, v8}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 105
    .line 106
    .line 107
    iget-object v7, v3, La/kec0;->e:La/a4x;

    .line 108
    .line 109
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    if-nez v7, :cond_0

    .line 114
    .line 115
    new-instance v7, La/dec0;

    .line 116
    .line 117
    const/4 v9, 0x0

    .line 118
    iget v10, p0, La/cec0;->d:F

    .line 119
    .line 120
    invoke-direct {v7, v10, v6, v2, v9}, La/dec0;-><init>(FFLjava/lang/Object;B)V

    .line 121
    .line 122
    .line 123
    new-instance v2, La/ugd;

    .line 124
    .line 125
    const v9, 0x16500f3c

    .line 126
    .line 127
    .line 128
    invoke-direct {v2, v9, v4, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-static {p1, v0, v0, v2, v8}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 132
    .line 133
    .line 134
    iget-object v0, v3, La/kec0;->e:La/a4x;

    .line 135
    .line 136
    new-instance v2, La/t4c0;

    .line 137
    .line 138
    const/16 v3, 0xe

    .line 139
    .line 140
    invoke-direct {v2, v3}, La/t4c0;-><init>(B)V

    .line 141
    .line 142
    .line 143
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    new-instance v7, La/zu90;

    .line 148
    .line 149
    const/16 v8, 0x12

    .line 150
    .line 151
    invoke-direct {v7, v8, v2, v0}, La/zu90;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    new-instance v2, La/d1c0;

    .line 155
    .line 156
    invoke-direct {v2, v0, v5}, La/d1c0;-><init>(Ljava/util/List;B)V

    .line 157
    .line 158
    .line 159
    new-instance v5, La/umh;

    .line 160
    .line 161
    iget-object p0, p0, La/cec0;->c:Lkotlin/jvm/functions/Function1;

    .line 162
    .line 163
    invoke-direct {v5, v0, v6, p0, v4}, La/umh;-><init>(Ljava/util/List;FLkotlin/jvm/functions/Function1;B)V

    .line 164
    .line 165
    .line 166
    new-instance p0, La/ugd;

    .line 167
    .line 168
    invoke-direct {p0, v1, v4, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, v3, v7, v2, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 172
    .line 173
    .line 174
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    return-object p0

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
