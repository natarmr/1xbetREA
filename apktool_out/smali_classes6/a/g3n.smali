.class public final synthetic La/g3n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:S

.field public final synthetic d:B

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mm40;Ljava/lang/Object;La/wdr;IIB)V
    .locals 0

    .line 2
    iput-byte p6, p0, La/g3n;->a:B

    iput-object p1, p0, La/g3n;->b:La/mm40;

    iput-object p2, p0, La/g3n;->e:Ljava/lang/Object;

    iput-object p3, p0, La/g3n;->f:Ljava/lang/Object;

    iput-short p4, p0, La/g3n;->c:S

    iput-byte p5, p0, La/g3n;->d:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/pm80;La/n4d;La/mm40;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/g3n;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/g3n;->e:Ljava/lang/Object;

    iput-object p2, p0, La/g3n;->f:Ljava/lang/Object;

    iput-object p3, p0, La/g3n;->b:La/mm40;

    iput-short p4, p0, La/g3n;->c:S

    iput-byte p5, p0, La/g3n;->d:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/g3n;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/g3n;->e:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, La/l7m0;

    .line 10
    .line 11
    iget-object v0, p0, La/g3n;->f:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, La/xdr;

    .line 15
    .line 16
    move-object v4, p1

    .line 17
    check-cast v4, La/fet;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-short p1, p0, La/g3n;->c:S

    .line 25
    .line 26
    or-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    invoke-static {p1}, La/x8x;->L(I)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    iget-object v1, p0, La/g3n;->b:La/mm40;

    .line 33
    .line 34
    iget-byte v6, p0, La/g3n;->d:B

    .line 35
    .line 36
    invoke-static/range {v1 .. v6}, La/x1x;->s(La/mm40;La/l7m0;La/xdr;La/fet;II)V

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_0
    iget-object v0, p0, La/g3n;->e:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v1, v0

    .line 45
    check-cast v1, La/pm80;

    .line 46
    .line 47
    iget-object v0, p0, La/g3n;->f:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v2, v0

    .line 50
    check-cast v2, La/n4d;

    .line 51
    .line 52
    move-object v4, p1

    .line 53
    check-cast v4, La/fet;

    .line 54
    .line 55
    check-cast p2, Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-short p1, p0, La/g3n;->c:S

    .line 61
    .line 62
    or-int/lit8 p1, p1, 0x1

    .line 63
    .line 64
    invoke-static {p1}, La/x8x;->L(I)I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    iget-object v3, p0, La/g3n;->b:La/mm40;

    .line 69
    .line 70
    iget-byte v6, p0, La/g3n;->d:B

    .line 71
    .line 72
    invoke-static/range {v1 .. v6}, La/dww;->a(La/pm80;La/n4d;La/mm40;La/fet;II)V

    .line 73
    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_1
    iget-object v0, p0, La/g3n;->e:Ljava/lang/Object;

    .line 79
    .line 80
    move-object v2, v0

    .line 81
    check-cast v2, La/n3n;

    .line 82
    .line 83
    iget-object v0, p0, La/g3n;->f:Ljava/lang/Object;

    .line 84
    .line 85
    move-object v3, v0

    .line 86
    check-cast v3, Lkotlin/jvm/functions/Function2;

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
    iget-short p1, p0, La/g3n;->c:S

    .line 97
    .line 98
    or-int/lit8 p1, p1, 0x1

    .line 99
    .line 100
    invoke-static {p1}, La/x8x;->L(I)I

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    iget-object v1, p0, La/g3n;->b:La/mm40;

    .line 105
    .line 106
    iget-byte v6, p0, La/g3n;->d:B

    .line 107
    .line 108
    invoke-static/range {v1 .. v6}, La/rsr0;->r(La/mm40;La/n3n;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 109
    .line 110
    .line 111
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
