.class public final synthetic La/kr8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:I

.field public final synthetic e:B

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:La/wdr;


# direct methods
.method public synthetic constructor <init>(La/bc;ZLkotlin/jvm/functions/Function0;La/mm40;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/kr8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/kr8;->f:Ljava/lang/Object;

    iput-boolean p2, p0, La/kr8;->b:Z

    iput-object p3, p0, La/kr8;->g:La/wdr;

    iput-object p4, p0, La/kr8;->c:Ljava/lang/Object;

    iput p5, p0, La/kr8;->d:I

    iput-byte p6, p0, La/kr8;->e:B

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZLa/wdr;IIB)V
    .locals 0

    .line 2
    iput-byte p7, p0, La/kr8;->a:B

    iput-object p1, p0, La/kr8;->c:Ljava/lang/Object;

    iput-object p2, p0, La/kr8;->f:Ljava/lang/Object;

    iput-boolean p3, p0, La/kr8;->b:Z

    iput-object p4, p0, La/kr8;->g:La/wdr;

    iput p5, p0, La/kr8;->d:I

    iput-byte p6, p0, La/kr8;->e:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/kr8;->a:B

    .line 2
    .line 3
    iget v1, p0, La/kr8;->d:I

    .line 4
    .line 5
    iget-object v2, p0, La/kr8;->g:La/wdr;

    .line 6
    .line 7
    iget-object v3, p0, La/kr8;->f:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, La/kr8;->c:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v5, v4

    .line 15
    check-cast v5, Ljava/lang/String;

    .line 16
    .line 17
    move-object v6, v3

    .line 18
    check-cast v6, La/zx7;

    .line 19
    .line 20
    move-object v8, v2

    .line 21
    check-cast v8, La/xdr;

    .line 22
    .line 23
    move-object v9, p1

    .line 24
    check-cast v9, La/fet;

    .line 25
    .line 26
    check-cast p2, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    or-int/lit8 p1, v1, 0x1

    .line 32
    .line 33
    invoke-static {p1}, La/x8x;->L(I)I

    .line 34
    .line 35
    .line 36
    move-result v10

    .line 37
    iget-boolean v7, p0, La/kr8;->b:Z

    .line 38
    .line 39
    iget-byte v11, p0, La/kr8;->e:B

    .line 40
    .line 41
    invoke-static/range {v5 .. v11}, La/zcm0;->c(Ljava/lang/String;La/zx7;ZLa/xdr;La/fet;II)V

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_0
    move-object v0, v4

    .line 48
    check-cast v0, La/mm40;

    .line 49
    .line 50
    check-cast v3, La/nuc0;

    .line 51
    .line 52
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 53
    .line 54
    move-object v4, p1

    .line 55
    check-cast v4, La/fet;

    .line 56
    .line 57
    check-cast p2, Ljava/lang/Integer;

    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    or-int/lit8 p1, v1, 0x1

    .line 63
    .line 64
    invoke-static {p1}, La/x8x;->L(I)I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    move-object v1, v3

    .line 69
    move-object v3, v2

    .line 70
    iget-boolean v2, p0, La/kr8;->b:Z

    .line 71
    .line 72
    iget-byte v6, p0, La/kr8;->e:B

    .line 73
    .line 74
    invoke-static/range {v0 .. v6}, La/x2x;->k(La/mm40;La/nuc0;ZLkotlin/jvm/functions/Function1;La/fet;II)V

    .line 75
    .line 76
    .line 77
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object p0

    .line 80
    :pswitch_1
    move-object v0, v3

    .line 81
    check-cast v0, La/bc;

    .line 82
    .line 83
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 84
    .line 85
    move-object v3, v4

    .line 86
    check-cast v3, La/mm40;

    .line 87
    .line 88
    move-object v4, p1

    .line 89
    check-cast v4, La/fet;

    .line 90
    .line 91
    check-cast p2, Ljava/lang/Integer;

    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    or-int/lit8 p1, v1, 0x1

    .line 97
    .line 98
    invoke-static {p1}, La/x8x;->L(I)I

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    iget-boolean v1, p0, La/kr8;->b:Z

    .line 103
    .line 104
    iget-byte v6, p0, La/kr8;->e:B

    .line 105
    .line 106
    invoke-static/range {v0 .. v6}, La/acb;->n(La/bc;ZLkotlin/jvm/functions/Function0;La/mm40;La/fet;II)V

    .line 107
    .line 108
    .line 109
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_2
    move-object v0, v4

    .line 113
    check-cast v0, La/mm40;

    .line 114
    .line 115
    check-cast v3, La/u12;

    .line 116
    .line 117
    check-cast v2, La/ugd;

    .line 118
    .line 119
    move-object v4, p1

    .line 120
    check-cast v4, La/fet;

    .line 121
    .line 122
    check-cast p2, Ljava/lang/Integer;

    .line 123
    .line 124
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    or-int/lit8 p1, v1, 0x1

    .line 128
    .line 129
    invoke-static {p1}, La/x8x;->L(I)I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    move-object v1, v3

    .line 134
    move-object v3, v2

    .line 135
    iget-boolean v2, p0, La/kr8;->b:Z

    .line 136
    .line 137
    iget-byte v6, p0, La/kr8;->e:B

    .line 138
    .line 139
    invoke-static/range {v0 .. v6}, La/nnw0;->g(La/mm40;La/u12;ZLa/ugd;La/fet;II)V

    .line 140
    .line 141
    .line 142
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    return-object p0

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
