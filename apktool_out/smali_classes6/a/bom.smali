.class public final synthetic La/bom;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:La/mm40;

.field public final synthetic e:La/hzc0;

.field public final synthetic f:Ljava/lang/Integer;

.field public final synthetic g:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(ZLjava/util/List;La/mm40;La/hzc0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/bom;->a:B

    iput-boolean p1, p0, La/bom;->b:Z

    iput-object p2, p0, La/bom;->c:Ljava/util/List;

    iput-object p3, p0, La/bom;->d:La/mm40;

    iput-object p4, p0, La/bom;->e:La/hzc0;

    iput-object p5, p0, La/bom;->f:Ljava/lang/Integer;

    iput-object p6, p0, La/bom;->g:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/bom;->a:B

    .line 2
    .line 3
    iget-boolean v1, p0, La/bom;->b:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    move-object v3, p1

    .line 10
    check-cast v3, La/i8z;

    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v6, p0, La/bom;->d:La/mm40;

    .line 16
    .line 17
    iget-object v7, p0, La/bom;->e:La/hzc0;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    new-instance p0, La/aom;

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    invoke-direct {p0, v6, v7, p1}, La/aom;-><init>(La/mm40;La/hzc0;B)V

    .line 25
    .line 26
    .line 27
    new-instance v7, La/ugd;

    .line 28
    .line 29
    const p1, -0x1a9f8daa

    .line 30
    .line 31
    .line 32
    invoke-direct {v7, p1, v2, p0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/16 v8, 0xe

    .line 36
    .line 37
    const/4 v4, 0x6

    .line 38
    const/4 v5, 0x0

    .line 39
    const/4 v6, 0x0

    .line 40
    invoke-static/range {v3 .. v8}, La/i8z;->f(La/i8z;ILa/oea;La/oea;La/ugd;I)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget-object v5, p0, La/bom;->c:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    new-instance v0, La/v2m;

    .line 51
    .line 52
    const/4 v1, 0x7

    .line 53
    invoke-direct {v0, v5, v1}, La/v2m;-><init>(Ljava/util/List;B)V

    .line 54
    .line 55
    .line 56
    new-instance v4, La/dom;

    .line 57
    .line 58
    const/4 v10, 0x0

    .line 59
    iget-object v8, p0, La/bom;->f:Ljava/lang/Integer;

    .line 60
    .line 61
    iget-object v9, p0, La/bom;->g:Lkotlin/jvm/functions/Function2;

    .line 62
    .line 63
    invoke-direct/range {v4 .. v10}, La/dom;-><init>(Ljava/util/List;La/mm40;La/hzc0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function2;B)V

    .line 64
    .line 65
    .line 66
    new-instance v8, La/ugd;

    .line 67
    .line 68
    const p0, -0x4297e015

    .line 69
    .line 70
    .line 71
    invoke-direct {v8, p0, v2, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    const/4 v5, 0x0

    .line 75
    const/4 v6, 0x0

    .line 76
    move v4, p1

    .line 77
    move-object v7, v0

    .line 78
    invoke-virtual/range {v3 .. v8}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_0
    move-object v0, p1

    .line 85
    check-cast v0, La/hcz;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    iget-object v5, p0, La/bom;->d:La/mm40;

    .line 91
    .line 92
    iget-object v6, p0, La/bom;->e:La/hzc0;

    .line 93
    .line 94
    if-eqz v1, :cond_1

    .line 95
    .line 96
    new-instance p0, La/aom;

    .line 97
    .line 98
    invoke-direct {p0, v5, v6, v2}, La/aom;-><init>(La/mm40;La/hzc0;B)V

    .line 99
    .line 100
    .line 101
    new-instance v4, La/ugd;

    .line 102
    .line 103
    const p1, 0x292414c7

    .line 104
    .line 105
    .line 106
    invoke-direct {v4, p1, v2, p0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    const/4 v5, 0x6

    .line 110
    const/4 v1, 0x6

    .line 111
    const/4 v2, 0x0

    .line 112
    const/4 v3, 0x0

    .line 113
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_1
    iget-object v4, p0, La/bom;->c:Ljava/util/List;

    .line 118
    .line 119
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    new-instance v1, La/v2m;

    .line 124
    .line 125
    const/16 v3, 0x8

    .line 126
    .line 127
    invoke-direct {v1, v4, v3}, La/v2m;-><init>(Ljava/util/List;B)V

    .line 128
    .line 129
    .line 130
    new-instance v3, La/dom;

    .line 131
    .line 132
    const/4 v9, 0x1

    .line 133
    iget-object v7, p0, La/bom;->f:Ljava/lang/Integer;

    .line 134
    .line 135
    iget-object v8, p0, La/bom;->g:Lkotlin/jvm/functions/Function2;

    .line 136
    .line 137
    invoke-direct/range {v3 .. v9}, La/dom;-><init>(Ljava/util/List;La/mm40;La/hzc0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function2;B)V

    .line 138
    .line 139
    .line 140
    new-instance p0, La/ugd;

    .line 141
    .line 142
    const v4, 0x2fd4df92

    .line 143
    .line 144
    .line 145
    invoke-direct {p0, v4, v2, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    const/4 v2, 0x0

    .line 149
    invoke-virtual {v0, p1, v2, v1, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 150
    .line 151
    .line 152
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    return-object p0

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
