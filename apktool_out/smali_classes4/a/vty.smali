.class public final synthetic La/vty;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:I

.field public final synthetic d:B

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILa/mm40;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/vty;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, La/vty;->e:Ljava/lang/Object;

    iput-object p3, p0, La/vty;->b:La/mm40;

    iput p1, p0, La/vty;->c:I

    iput-byte p2, p0, La/vty;->d:B

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/foh;II)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/vty;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vty;->b:La/mm40;

    iput-object p2, p0, La/vty;->e:Ljava/lang/Object;

    iput-byte p3, p0, La/vty;->d:B

    iput p4, p0, La/vty;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/vty;->a:B

    .line 2
    .line 3
    iget-byte v1, p0, La/vty;->d:B

    .line 4
    .line 5
    iget v2, p0, La/vty;->c:I

    .line 6
    .line 7
    iget-object v3, p0, La/vty;->b:La/mm40;

    .line 8
    .line 9
    iget-object p0, p0, La/vty;->e:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, Lkotlin/jvm/functions/Function0;

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
    or-int/lit8 p2, v2, 0x1

    .line 24
    .line 25
    invoke-static {p2}, La/x8x;->L(I)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    invoke-static {p2, v1, p1, v3, p0}, La/x1x;->l(IILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_0
    check-cast p0, La/foh;

    .line 36
    .line 37
    check-cast p1, La/fet;

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    or-int/lit8 p2, v2, 0x1

    .line 45
    .line 46
    invoke-static {p2}, La/x8x;->L(I)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    invoke-static {v3, p0, v1, p1, p2}, La/vdx;->f(La/mm40;La/foh;ILa/fet;I)V

    .line 51
    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
