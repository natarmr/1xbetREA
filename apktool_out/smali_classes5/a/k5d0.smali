.class public final synthetic La/k5d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:S

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILa/a4x;La/mm40;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/k5d0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, La/k5d0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/k5d0;->d:Ljava/lang/Object;

    iput-short p1, p0, La/k5d0;->b:S

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function0;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/k5d0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/k5d0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/k5d0;->d:Ljava/lang/Object;

    iput-short p3, p0, La/k5d0;->b:S

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/k5d0;->a:B

    .line 2
    .line 3
    iget-short v1, p0, La/k5d0;->b:S

    .line 4
    .line 5
    iget-object v2, p0, La/k5d0;->d:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, La/k5d0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, La/mm40;

    .line 13
    .line 14
    check-cast v2, La/a4x;

    .line 15
    .line 16
    check-cast p1, La/fet;

    .line 17
    .line 18
    check-cast p2, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    or-int/lit8 p2, v1, 0x1

    .line 24
    .line 25
    invoke-static {p2}, La/x8x;->L(I)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    invoke-static {p2, p1, v2, p0}, La/tnq0;->d(ILa/fet;La/a4x;La/mm40;)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_0
    check-cast p0, Ljava/util/List;

    .line 36
    .line 37
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 38
    .line 39
    check-cast p1, La/fet;

    .line 40
    .line 41
    check-cast p2, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    or-int/lit8 p2, v1, 0x1

    .line 47
    .line 48
    invoke-static {p2}, La/x8x;->L(I)I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    sget-object v0, La/jm40;->b:La/jm40;

    .line 53
    .line 54
    invoke-static {v0, p0, v2, p1, p2}, La/x8x;->f(La/mm40;Ljava/util/List;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 55
    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
