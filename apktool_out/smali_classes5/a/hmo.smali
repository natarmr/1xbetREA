.class public final synthetic La/hmo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:S

.field public final synthetic e:Z

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/fak0;ZLkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput-byte v0, p0, La/hmo;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/hmo;->b:La/mm40;

    iput-object p2, p0, La/hmo;->f:Ljava/lang/Object;

    iput-boolean p3, p0, La/hmo;->e:Z

    iput-object p4, p0, La/hmo;->c:Ljava/lang/Object;

    iput-short p5, p0, La/hmo;->d:S

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;Ljava/lang/Object;Ljava/lang/Object;IIB)V
    .locals 0

    .line 2
    iput-byte p6, p0, La/hmo;->a:B

    iput-object p1, p0, La/hmo;->b:La/mm40;

    iput-object p2, p0, La/hmo;->f:Ljava/lang/Object;

    iput-object p3, p0, La/hmo;->c:Ljava/lang/Object;

    iput-short p4, p0, La/hmo;->d:S

    iput-boolean p5, p0, La/hmo;->e:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/hmo;->a:B

    .line 2
    .line 3
    iget-short v1, p0, La/hmo;->d:S

    .line 4
    .line 5
    iget-object v2, p0, La/hmo;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/hmo;->f:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v5, v3

    .line 13
    check-cast v5, La/fak0;

    .line 14
    .line 15
    move-object v7, v2

    .line 16
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 17
    .line 18
    move-object v8, p1

    .line 19
    check-cast v8, La/fet;

    .line 20
    .line 21
    check-cast p2, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    or-int/lit8 p1, v1, 0x1

    .line 27
    .line 28
    invoke-static {p1}, La/x8x;->L(I)I

    .line 29
    .line 30
    .line 31
    move-result v9

    .line 32
    iget-object v4, p0, La/hmo;->b:La/mm40;

    .line 33
    .line 34
    iget-boolean v6, p0, La/hmo;->e:Z

    .line 35
    .line 36
    invoke-static/range {v4 .. v9}, La/x8x;->j(La/mm40;La/fak0;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_0
    check-cast v3, La/cdg0;

    .line 43
    .line 44
    check-cast v2, La/vcg0;

    .line 45
    .line 46
    check-cast p1, La/fet;

    .line 47
    .line 48
    check-cast p2, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    or-int/lit8 p2, v1, 0x1

    .line 54
    .line 55
    invoke-static {p2}, La/x8x;->L(I)I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    iget-object v0, p0, La/hmo;->b:La/mm40;

    .line 60
    .line 61
    iget-boolean v5, p0, La/hmo;->e:Z

    .line 62
    .line 63
    move-object v1, v3

    .line 64
    move-object v3, p1

    .line 65
    invoke-static/range {v0 .. v5}, La/bdg0;->a(La/mm40;La/cdg0;La/vcg0;La/fet;II)V

    .line 66
    .line 67
    .line 68
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_1
    check-cast v3, La/lmo;

    .line 72
    .line 73
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 74
    .line 75
    check-cast p1, La/fet;

    .line 76
    .line 77
    check-cast p2, Ljava/lang/Integer;

    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    or-int/lit8 p2, v1, 0x1

    .line 83
    .line 84
    invoke-static {p2}, La/x8x;->L(I)I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    iget-object v0, p0, La/hmo;->b:La/mm40;

    .line 89
    .line 90
    iget-boolean v5, p0, La/hmo;->e:Z

    .line 91
    .line 92
    move-object v1, v3

    .line 93
    move-object v3, p1

    .line 94
    invoke-static/range {v0 .. v5}, La/vdb;->D(La/mm40;La/lmo;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 95
    .line 96
    .line 97
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_2
    check-cast v3, La/kmo;

    .line 101
    .line 102
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 103
    .line 104
    check-cast p1, La/fet;

    .line 105
    .line 106
    check-cast p2, Ljava/lang/Integer;

    .line 107
    .line 108
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    or-int/lit8 p2, v1, 0x1

    .line 112
    .line 113
    invoke-static {p2}, La/x8x;->L(I)I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    iget-object v0, p0, La/hmo;->b:La/mm40;

    .line 118
    .line 119
    iget-boolean v5, p0, La/hmo;->e:Z

    .line 120
    .line 121
    move-object v1, v3

    .line 122
    move-object v3, p1

    .line 123
    invoke-static/range {v0 .. v5}, La/rcb;->F(La/mm40;La/kmo;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 124
    .line 125
    .line 126
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
