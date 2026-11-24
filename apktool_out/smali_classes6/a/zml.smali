.class public final synthetic La/zml;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/uzh;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:Lkotlin/jvm/functions/Function0;

.field public final synthetic g:Lkotlin/jvm/functions/Function0;

.field public final synthetic h:Lkotlin/jvm/functions/Function0;

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(La/mm40;La/uzh;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;IB)V
    .locals 0

    .line 1
    iput-byte p9, p0, La/zml;->a:B

    iput-object p1, p0, La/zml;->b:La/mm40;

    iput-object p2, p0, La/zml;->c:La/uzh;

    iput-object p3, p0, La/zml;->d:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, La/zml;->e:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, La/zml;->f:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, La/zml;->g:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, La/zml;->h:Lkotlin/jvm/functions/Function0;

    iput p8, p0, La/zml;->i:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/zml;->a:B

    .line 2
    .line 3
    iget v1, p0, La/zml;->i:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v9, p1

    .line 9
    check-cast v9, La/fet;

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
    move-result v10

    .line 22
    iget-object v2, p0, La/zml;->b:La/mm40;

    .line 23
    .line 24
    iget-object v3, p0, La/zml;->c:La/uzh;

    .line 25
    .line 26
    iget-object v4, p0, La/zml;->d:Lkotlin/jvm/functions/Function0;

    .line 27
    .line 28
    iget-object v5, p0, La/zml;->e:Lkotlin/jvm/functions/Function0;

    .line 29
    .line 30
    iget-object v6, p0, La/zml;->f:Lkotlin/jvm/functions/Function0;

    .line 31
    .line 32
    iget-object v7, p0, La/zml;->g:Lkotlin/jvm/functions/Function0;

    .line 33
    .line 34
    iget-object v8, p0, La/zml;->h:Lkotlin/jvm/functions/Function0;

    .line 35
    .line 36
    invoke-static/range {v2 .. v10}, La/mrv;->e(La/mm40;La/uzh;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_0
    move-object v7, p1

    .line 43
    check-cast v7, La/fet;

    .line 44
    .line 45
    check-cast p2, Ljava/lang/Integer;

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    or-int/lit8 p1, v1, 0x1

    .line 51
    .line 52
    invoke-static {p1}, La/x8x;->L(I)I

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    iget-object v0, p0, La/zml;->b:La/mm40;

    .line 57
    .line 58
    iget-object v1, p0, La/zml;->c:La/uzh;

    .line 59
    .line 60
    iget-object v2, p0, La/zml;->d:Lkotlin/jvm/functions/Function0;

    .line 61
    .line 62
    iget-object v3, p0, La/zml;->e:Lkotlin/jvm/functions/Function0;

    .line 63
    .line 64
    iget-object v4, p0, La/zml;->f:Lkotlin/jvm/functions/Function0;

    .line 65
    .line 66
    iget-object v5, p0, La/zml;->g:Lkotlin/jvm/functions/Function0;

    .line 67
    .line 68
    iget-object v6, p0, La/zml;->h:Lkotlin/jvm/functions/Function0;

    .line 69
    .line 70
    invoke-static/range {v0 .. v8}, La/ntr;->e(La/mm40;La/uzh;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 71
    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_1
    move-object v7, p1

    .line 77
    check-cast v7, La/fet;

    .line 78
    .line 79
    check-cast p2, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    or-int/lit8 p1, v1, 0x1

    .line 85
    .line 86
    invoke-static {p1}, La/x8x;->L(I)I

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    iget-object v0, p0, La/zml;->b:La/mm40;

    .line 91
    .line 92
    iget-object v1, p0, La/zml;->c:La/uzh;

    .line 93
    .line 94
    iget-object v2, p0, La/zml;->d:Lkotlin/jvm/functions/Function0;

    .line 95
    .line 96
    iget-object v3, p0, La/zml;->e:Lkotlin/jvm/functions/Function0;

    .line 97
    .line 98
    iget-object v4, p0, La/zml;->f:Lkotlin/jvm/functions/Function0;

    .line 99
    .line 100
    iget-object v5, p0, La/zml;->g:Lkotlin/jvm/functions/Function0;

    .line 101
    .line 102
    iget-object v6, p0, La/zml;->h:Lkotlin/jvm/functions/Function0;

    .line 103
    .line 104
    invoke-static/range {v0 .. v8}, La/kkb;->c(La/mm40;La/uzh;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 105
    .line 106
    .line 107
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_2
    move-object v7, p1

    .line 111
    check-cast v7, La/fet;

    .line 112
    .line 113
    check-cast p2, Ljava/lang/Integer;

    .line 114
    .line 115
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    or-int/lit8 p1, v1, 0x1

    .line 119
    .line 120
    invoke-static {p1}, La/x8x;->L(I)I

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    iget-object v0, p0, La/zml;->b:La/mm40;

    .line 125
    .line 126
    iget-object v1, p0, La/zml;->c:La/uzh;

    .line 127
    .line 128
    iget-object v2, p0, La/zml;->d:Lkotlin/jvm/functions/Function0;

    .line 129
    .line 130
    iget-object v3, p0, La/zml;->e:Lkotlin/jvm/functions/Function0;

    .line 131
    .line 132
    iget-object v4, p0, La/zml;->f:Lkotlin/jvm/functions/Function0;

    .line 133
    .line 134
    iget-object v5, p0, La/zml;->g:Lkotlin/jvm/functions/Function0;

    .line 135
    .line 136
    iget-object v6, p0, La/zml;->h:Lkotlin/jvm/functions/Function0;

    .line 137
    .line 138
    invoke-static/range {v0 .. v8}, La/eeq;->d(La/mm40;La/uzh;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 139
    .line 140
    .line 141
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object p0

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
