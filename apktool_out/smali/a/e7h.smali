.class public final synthetic La/e7h;
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


# direct methods
.method public synthetic constructor <init>(La/mm40;Ljava/lang/Object;IIB)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/e7h;->a:B

    iput-object p1, p0, La/e7h;->b:La/mm40;

    iput-object p2, p0, La/e7h;->e:Ljava/lang/Object;

    iput-byte p3, p0, La/e7h;->c:B

    iput-byte p4, p0, La/e7h;->d:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;III)V
    .locals 0

    .line 1
    const/4 p4, 0x3

    iput-byte p4, p0, La/e7h;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/e7h;->b:La/mm40;

    iput-object p2, p0, La/e7h;->e:Ljava/lang/Object;

    iput-byte p3, p0, La/e7h;->c:B

    iput-byte p5, p0, La/e7h;->d:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/e7h;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/e7h;->e:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, Ljava/lang/String;

    .line 10
    .line 11
    move-object v4, p1

    .line 12
    check-cast v4, La/fet;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    invoke-static {p1}, La/x8x;->L(I)I

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    iget-object v1, p0, La/e7h;->b:La/mm40;

    .line 25
    .line 26
    iget-byte v3, p0, La/e7h;->c:B

    .line 27
    .line 28
    iget-byte v6, p0, La/e7h;->d:B

    .line 29
    .line 30
    invoke-static/range {v1 .. v6}, La/rsm0;->i(La/mm40;Ljava/lang/String;ILa/fet;II)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    iget-object v0, p0, La/e7h;->e:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, La/xdr;

    .line 39
    .line 40
    check-cast p1, La/fet;

    .line 41
    .line 42
    check-cast p2, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-byte p2, p0, La/e7h;->c:B

    .line 48
    .line 49
    or-int/lit8 p2, p2, 0x1

    .line 50
    .line 51
    invoke-static {p2}, La/x8x;->L(I)I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    iget-object v1, p0, La/e7h;->b:La/mm40;

    .line 56
    .line 57
    iget-byte p0, p0, La/e7h;->d:B

    .line 58
    .line 59
    invoke-static {v1, v0, p1, p2, p0}, La/x2x;->q(La/mm40;La/xdr;La/fet;II)V

    .line 60
    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_1
    iget-object v0, p0, La/e7h;->e:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, La/dkm;

    .line 68
    .line 69
    check-cast p1, La/fet;

    .line 70
    .line 71
    check-cast p2, Ljava/lang/Integer;

    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-byte p2, p0, La/e7h;->c:B

    .line 77
    .line 78
    or-int/lit8 p2, p2, 0x1

    .line 79
    .line 80
    invoke-static {p2}, La/x8x;->L(I)I

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    iget-object v1, p0, La/e7h;->b:La/mm40;

    .line 85
    .line 86
    iget-byte p0, p0, La/e7h;->d:B

    .line 87
    .line 88
    invoke-static {v1, v0, p1, p2, p0}, La/kpb;->j(La/mm40;La/dkm;La/fet;II)V

    .line 89
    .line 90
    .line 91
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object p0

    .line 94
    :pswitch_2
    iget-object v0, p0, La/e7h;->e:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, La/hh80;

    .line 97
    .line 98
    check-cast p1, La/fet;

    .line 99
    .line 100
    check-cast p2, Ljava/lang/Integer;

    .line 101
    .line 102
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    iget-byte p2, p0, La/e7h;->c:B

    .line 106
    .line 107
    or-int/lit8 p2, p2, 0x1

    .line 108
    .line 109
    invoke-static {p2}, La/x8x;->L(I)I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    iget-object v1, p0, La/e7h;->b:La/mm40;

    .line 114
    .line 115
    iget-byte p0, p0, La/e7h;->d:B

    .line 116
    .line 117
    invoke-static {v1, v0, p1, p2, p0}, La/wzb;->j(La/mm40;La/hh80;La/fet;II)V

    .line 118
    .line 119
    .line 120
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
