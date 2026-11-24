.class public final synthetic La/y53;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a4x;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;

.field public final synthetic d:La/mm40;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(La/a4x;Lkotlin/jvm/functions/Function2;La/mm40;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/y53;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/y53;->b:La/a4x;

    iput-object p2, p0, La/y53;->c:Lkotlin/jvm/functions/Function2;

    iput-object p3, p0, La/y53;->d:La/mm40;

    iput p4, p0, La/y53;->e:I

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/a4x;Lkotlin/jvm/functions/Function2;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/y53;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/y53;->d:La/mm40;

    iput-object p2, p0, La/y53;->b:La/a4x;

    iput-object p3, p0, La/y53;->c:Lkotlin/jvm/functions/Function2;

    iput p4, p0, La/y53;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/y53;->a:B

    .line 2
    .line 3
    check-cast p1, La/fet;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget p2, p0, La/y53;->e:I

    .line 14
    .line 15
    or-int/lit8 p2, p2, 0x1

    .line 16
    .line 17
    invoke-static {p2}, La/x8x;->L(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iget-object v0, p0, La/y53;->b:La/a4x;

    .line 22
    .line 23
    iget-object v1, p0, La/y53;->d:La/mm40;

    .line 24
    .line 25
    iget-object p0, p0, La/y53;->c:Lkotlin/jvm/functions/Function2;

    .line 26
    .line 27
    invoke-static {p2, p1, v0, v1, p0}, La/vbw0;->C(ILa/fet;La/a4x;La/mm40;Lkotlin/jvm/functions/Function2;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    iget p2, p0, La/y53;->e:I

    .line 34
    .line 35
    or-int/lit8 p2, p2, 0x1

    .line 36
    .line 37
    invoke-static {p2}, La/x8x;->L(I)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    iget-object v0, p0, La/y53;->b:La/a4x;

    .line 42
    .line 43
    iget-object v1, p0, La/y53;->d:La/mm40;

    .line 44
    .line 45
    iget-object p0, p0, La/y53;->c:Lkotlin/jvm/functions/Function2;

    .line 46
    .line 47
    invoke-static {p2, p1, v0, v1, p0}, La/xia0;->C(ILa/fet;La/a4x;La/mm40;Lkotlin/jvm/functions/Function2;)V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
