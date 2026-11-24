.class public final synthetic La/a330;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/xdr;

.field public final synthetic d:La/ugd;

.field public final synthetic e:La/ugd;

.field public final synthetic f:La/ugd;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/ugd;La/ugd;La/xdr;La/ugd;I)V
    .locals 0

    .line 1
    const/4 p6, 0x0

    iput-byte p6, p0, La/a330;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/a330;->b:La/mm40;

    iput-object p2, p0, La/a330;->d:La/ugd;

    iput-object p3, p0, La/a330;->e:La/ugd;

    iput-object p4, p0, La/a330;->c:La/xdr;

    iput-object p5, p0, La/a330;->f:La/ugd;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/xdr;La/ugd;La/ugd;La/ugd;I)V
    .locals 0

    .line 2
    const/4 p6, 0x1

    iput-byte p6, p0, La/a330;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/a330;->b:La/mm40;

    iput-object p2, p0, La/a330;->c:La/xdr;

    iput-object p3, p0, La/a330;->d:La/ugd;

    iput-object p4, p0, La/a330;->e:La/ugd;

    iput-object p5, p0, La/a330;->f:La/ugd;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/a330;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v6, p1

    .line 7
    check-cast v6, La/fet;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/16 p1, 0x6d81

    .line 15
    .line 16
    invoke-static {p1}, La/x8x;->L(I)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget-object v2, p0, La/a330;->d:La/ugd;

    .line 21
    .line 22
    iget-object v3, p0, La/a330;->e:La/ugd;

    .line 23
    .line 24
    iget-object v4, p0, La/a330;->f:La/ugd;

    .line 25
    .line 26
    iget-object v5, p0, La/a330;->c:La/xdr;

    .line 27
    .line 28
    iget-object v7, p0, La/a330;->b:La/mm40;

    .line 29
    .line 30
    invoke-static/range {v1 .. v7}, La/m7x;->k(ILa/ugd;La/ugd;La/ugd;La/xdr;La/fet;La/mm40;)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    move-object v5, p1

    .line 37
    check-cast v5, La/fet;

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const/16 p1, 0x61b1

    .line 45
    .line 46
    invoke-static {p1}, La/x8x;->L(I)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v1, p0, La/a330;->d:La/ugd;

    .line 51
    .line 52
    iget-object v2, p0, La/a330;->e:La/ugd;

    .line 53
    .line 54
    iget-object v3, p0, La/a330;->f:La/ugd;

    .line 55
    .line 56
    iget-object v4, p0, La/a330;->c:La/xdr;

    .line 57
    .line 58
    iget-object v6, p0, La/a330;->b:La/mm40;

    .line 59
    .line 60
    invoke-static/range {v0 .. v6}, La/xdx;->d(ILa/ugd;La/ugd;La/ugd;La/xdr;La/fet;La/mm40;)V

    .line 61
    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
