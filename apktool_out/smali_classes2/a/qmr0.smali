.class public final synthetic La/qmr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/l7m0;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(La/l7m0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/mm40;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/qmr0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/qmr0;->c:La/l7m0;

    iput-object p2, p0, La/qmr0;->d:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, La/qmr0;->e:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, La/qmr0;->b:La/mm40;

    iput p5, p0, La/qmr0;->f:I

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/l7m0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/qmr0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/qmr0;->b:La/mm40;

    iput-object p2, p0, La/qmr0;->c:La/l7m0;

    iput-object p3, p0, La/qmr0;->d:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, La/qmr0;->e:Lkotlin/jvm/functions/Function0;

    iput p5, p0, La/qmr0;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/qmr0;->a:B

    .line 2
    .line 3
    iget v1, p0, La/qmr0;->f:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object v3, p1

    .line 9
    check-cast v3, La/fet;

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
    move-result v2

    .line 22
    iget-object v4, p0, La/qmr0;->b:La/mm40;

    .line 23
    .line 24
    iget-object v5, p0, La/qmr0;->c:La/l7m0;

    .line 25
    .line 26
    iget-object v6, p0, La/qmr0;->d:Lkotlin/jvm/functions/Function0;

    .line 27
    .line 28
    iget-object v7, p0, La/qmr0;->e:Lkotlin/jvm/functions/Function0;

    .line 29
    .line 30
    invoke-static/range {v2 .. v7}, La/dem0;->g(ILa/fet;La/mm40;La/l7m0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    check-cast p1, La/fet;

    .line 37
    .line 38
    check-cast p2, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    or-int/lit8 p2, v1, 0x1

    .line 44
    .line 45
    invoke-static {p2}, La/x8x;->L(I)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget-object v2, p0, La/qmr0;->b:La/mm40;

    .line 50
    .line 51
    iget-object v3, p0, La/qmr0;->c:La/l7m0;

    .line 52
    .line 53
    iget-object v4, p0, La/qmr0;->d:Lkotlin/jvm/functions/Function0;

    .line 54
    .line 55
    iget-object v5, p0, La/qmr0;->e:Lkotlin/jvm/functions/Function0;

    .line 56
    .line 57
    move-object v1, p1

    .line 58
    invoke-static/range {v0 .. v5}, La/pvm0;->h(ILa/fet;La/mm40;La/l7m0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
