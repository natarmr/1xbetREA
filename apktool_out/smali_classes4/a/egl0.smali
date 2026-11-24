.class public final synthetic La/egl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kfl0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(La/kfl0;Lkotlin/jvm/functions/Function1;ZB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/egl0;->a:B

    iput-object p1, p0, La/egl0;->b:La/kfl0;

    iput-object p2, p0, La/egl0;->c:Lkotlin/jvm/functions/Function1;

    iput-boolean p3, p0, La/egl0;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/egl0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const v2, 0x799532c4

    .line 5
    .line 6
    .line 7
    check-cast p1, La/hcz;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v5, p0, La/egl0;->b:La/kfl0;

    .line 16
    .line 17
    iget-object v4, v5, La/kfl0;->b:La/a4x;

    .line 18
    .line 19
    new-instance v0, La/gcl0;

    .line 20
    .line 21
    const/16 v3, 0x8

    .line 22
    .line 23
    invoke-direct {v0, v3}, La/gcl0;-><init>(B)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v9

    .line 30
    new-instance v10, La/o3l0;

    .line 31
    .line 32
    const/16 v3, 0xf

    .line 33
    .line 34
    invoke-direct {v10, v0, v4, v3}, La/o3l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    new-instance v0, La/y9k0;

    .line 38
    .line 39
    const/16 v3, 0x12

    .line 40
    .line 41
    invoke-direct {v0, v4, v3}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 42
    .line 43
    .line 44
    new-instance v3, La/hgl0;

    .line 45
    .line 46
    const/4 v8, 0x2

    .line 47
    iget-object v6, p0, La/egl0;->c:Lkotlin/jvm/functions/Function1;

    .line 48
    .line 49
    iget-boolean v7, p0, La/egl0;->d:Z

    .line 50
    .line 51
    invoke-direct/range {v3 .. v8}, La/hgl0;-><init>(Ljava/util/List;La/kfl0;Lkotlin/jvm/functions/Function1;ZB)V

    .line 52
    .line 53
    .line 54
    new-instance p0, La/ugd;

    .line 55
    .line 56
    invoke-direct {p0, v2, v1, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, v9, v10, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 60
    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    iget-object v5, p0, La/egl0;->b:La/kfl0;

    .line 69
    .line 70
    iget-object v4, v5, La/kfl0;->b:La/a4x;

    .line 71
    .line 72
    new-instance v0, La/gcl0;

    .line 73
    .line 74
    const/4 v3, 0x7

    .line 75
    invoke-direct {v0, v3}, La/gcl0;-><init>(B)V

    .line 76
    .line 77
    .line 78
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    new-instance v10, La/o3l0;

    .line 83
    .line 84
    const/16 v3, 0xb

    .line 85
    .line 86
    invoke-direct {v10, v0, v4, v3}, La/o3l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 87
    .line 88
    .line 89
    new-instance v0, La/y9k0;

    .line 90
    .line 91
    const/16 v3, 0xe

    .line 92
    .line 93
    invoke-direct {v0, v4, v3}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 94
    .line 95
    .line 96
    new-instance v3, La/hgl0;

    .line 97
    .line 98
    const/4 v8, 0x0

    .line 99
    iget-object v6, p0, La/egl0;->c:Lkotlin/jvm/functions/Function1;

    .line 100
    .line 101
    iget-boolean v7, p0, La/egl0;->d:Z

    .line 102
    .line 103
    invoke-direct/range {v3 .. v8}, La/hgl0;-><init>(Ljava/util/List;La/kfl0;Lkotlin/jvm/functions/Function1;ZB)V

    .line 104
    .line 105
    .line 106
    new-instance p0, La/ugd;

    .line 107
    .line 108
    invoke-direct {p0, v2, v1, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v9, v10, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 112
    .line 113
    .line 114
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    iget-object v5, p0, La/egl0;->b:La/kfl0;

    .line 121
    .line 122
    iget-object v4, v5, La/kfl0;->b:La/a4x;

    .line 123
    .line 124
    new-instance v0, La/gcl0;

    .line 125
    .line 126
    const/16 v3, 0xa

    .line 127
    .line 128
    invoke-direct {v0, v3}, La/gcl0;-><init>(B)V

    .line 129
    .line 130
    .line 131
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 132
    .line 133
    .line 134
    move-result v9

    .line 135
    new-instance v10, La/o3l0;

    .line 136
    .line 137
    const/16 v3, 0xd

    .line 138
    .line 139
    invoke-direct {v10, v0, v4, v3}, La/o3l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 140
    .line 141
    .line 142
    new-instance v0, La/y9k0;

    .line 143
    .line 144
    const/16 v3, 0x10

    .line 145
    .line 146
    invoke-direct {v0, v4, v3}, La/y9k0;-><init>(Ljava/util/List;B)V

    .line 147
    .line 148
    .line 149
    new-instance v3, La/hgl0;

    .line 150
    .line 151
    const/4 v8, 0x1

    .line 152
    iget-object v6, p0, La/egl0;->c:Lkotlin/jvm/functions/Function1;

    .line 153
    .line 154
    iget-boolean v7, p0, La/egl0;->d:Z

    .line 155
    .line 156
    invoke-direct/range {v3 .. v8}, La/hgl0;-><init>(Ljava/util/List;La/kfl0;Lkotlin/jvm/functions/Function1;ZB)V

    .line 157
    .line 158
    .line 159
    new-instance p0, La/ugd;

    .line 160
    .line 161
    invoke-direct {p0, v2, v1, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, v9, v10, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 165
    .line 166
    .line 167
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object p0

    .line 170
    nop

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
