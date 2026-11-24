.class public final synthetic La/lph;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:B

.field public final synthetic d:B

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mm40;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IIB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/lph;->a:B

    iput-object p1, p0, La/lph;->b:La/mm40;

    iput-object p2, p0, La/lph;->e:Ljava/lang/Object;

    iput-object p3, p0, La/lph;->f:Ljava/lang/Object;

    iput-object p4, p0, La/lph;->g:Ljava/lang/Object;

    iput-byte p5, p0, La/lph;->c:B

    iput-byte p6, p0, La/lph;->d:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/lph;->a:B

    .line 2
    .line 3
    iget-byte v1, p0, La/lph;->c:B

    .line 4
    .line 5
    iget-object v2, p0, La/lph;->g:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/lph;->f:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, La/lph;->e:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v6, v4

    .line 15
    check-cast v6, La/gx1;

    .line 16
    .line 17
    move-object v7, v3

    .line 18
    check-cast v7, La/asl;

    .line 19
    .line 20
    move-object v8, v2

    .line 21
    check-cast v8, Lkotlin/jvm/functions/Function0;

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
    iget-object v5, p0, La/lph;->b:La/mm40;

    .line 38
    .line 39
    iget-byte v11, p0, La/lph;->d:B

    .line 40
    .line 41
    invoke-static/range {v5 .. v11}, La/vdb;->v(La/mm40;La/gx1;La/asl;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_0
    check-cast v4, La/jll;

    .line 48
    .line 49
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 50
    .line 51
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 52
    .line 53
    check-cast p1, La/fet;

    .line 54
    .line 55
    check-cast p2, Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    or-int/lit8 p2, v1, 0x1

    .line 61
    .line 62
    invoke-static {p2}, La/x8x;->L(I)I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    iget-object v0, p0, La/lph;->b:La/mm40;

    .line 67
    .line 68
    iget-byte v6, p0, La/lph;->d:B

    .line 69
    .line 70
    move-object v1, v3

    .line 71
    move-object v3, v2

    .line 72
    move-object v2, v1

    .line 73
    move-object v1, v4

    .line 74
    move-object v4, p1

    .line 75
    invoke-static/range {v0 .. v6}, La/saj;->r(La/mm40;La/jll;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 76
    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_1
    check-cast v4, Ljava/lang/String;

    .line 82
    .line 83
    check-cast v3, Ljava/lang/String;

    .line 84
    .line 85
    check-cast v2, La/y3d;

    .line 86
    .line 87
    check-cast p1, La/fet;

    .line 88
    .line 89
    check-cast p2, Ljava/lang/Integer;

    .line 90
    .line 91
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    or-int/lit8 p2, v1, 0x1

    .line 95
    .line 96
    invoke-static {p2}, La/x8x;->L(I)I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    iget-object v0, p0, La/lph;->b:La/mm40;

    .line 101
    .line 102
    iget-byte v6, p0, La/lph;->d:B

    .line 103
    .line 104
    move-object v1, v3

    .line 105
    move-object v3, v2

    .line 106
    move-object v2, v1

    .line 107
    move-object v1, v4

    .line 108
    move-object v4, p1

    .line 109
    invoke-static/range {v0 .. v6}, La/mbc;->h(La/mm40;Ljava/lang/String;Ljava/lang/String;La/y3d;La/fet;II)V

    .line 110
    .line 111
    .line 112
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    return-object p0

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
