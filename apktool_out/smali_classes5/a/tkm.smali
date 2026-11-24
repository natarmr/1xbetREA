.class public final synthetic La/tkm;
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


# direct methods
.method public synthetic constructor <init>(La/mm40;Ljava/lang/Object;Ljava/lang/Object;IIB)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/tkm;->a:B

    iput-object p1, p0, La/tkm;->b:La/mm40;

    iput-object p2, p0, La/tkm;->e:Ljava/lang/Object;

    iput-object p3, p0, La/tkm;->f:Ljava/lang/Object;

    iput-byte p4, p0, La/tkm;->c:B

    iput-byte p5, p0, La/tkm;->d:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/tkm;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/tkm;->e:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, Ljava/lang/String;

    .line 10
    .line 11
    iget-object v0, p0, La/tkm;->f:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, La/y3d;

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
    iget-byte p1, p0, La/tkm;->c:B

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
    iget-object v1, p0, La/tkm;->b:La/mm40;

    .line 33
    .line 34
    iget-byte v6, p0, La/tkm;->d:B

    .line 35
    .line 36
    invoke-static/range {v1 .. v6}, La/pzb;->n(La/mm40;Ljava/lang/String;La/y3d;La/fet;II)V

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_0
    iget-object v0, p0, La/tkm;->e:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v2, v0

    .line 45
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 46
    .line 47
    iget-object v0, p0, La/tkm;->f:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v3, v0

    .line 50
    check-cast v3, La/vc50;

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
    iget-byte p1, p0, La/tkm;->c:B

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
    iget-object v1, p0, La/tkm;->b:La/mm40;

    .line 69
    .line 70
    iget-byte v6, p0, La/tkm;->d:B

    .line 71
    .line 72
    invoke-static/range {v1 .. v6}, La/vtb;->v(La/mm40;Lkotlin/jvm/functions/Function1;La/vc50;La/fet;II)V

    .line 73
    .line 74
    .line 75
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
