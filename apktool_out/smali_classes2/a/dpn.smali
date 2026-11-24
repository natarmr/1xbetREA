.class public final synthetic La/dpn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/mdm;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:B


# direct methods
.method public synthetic constructor <init>(La/mm40;La/mdm;Lkotlin/jvm/functions/Function0;IIB)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/dpn;->a:B

    iput-object p1, p0, La/dpn;->b:La/mm40;

    iput-object p2, p0, La/dpn;->c:La/mdm;

    iput-object p3, p0, La/dpn;->d:Lkotlin/jvm/functions/Function0;

    iput-byte p5, p0, La/dpn;->e:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/dpn;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    move-object v5, p1

    .line 8
    check-cast v5, La/fet;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-static {v1}, La/x8x;->L(I)I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    iget-object v2, p0, La/dpn;->b:La/mm40;

    .line 20
    .line 21
    iget-object v3, p0, La/dpn;->c:La/mdm;

    .line 22
    .line 23
    iget-object v4, p0, La/dpn;->d:Lkotlin/jvm/functions/Function0;

    .line 24
    .line 25
    iget-byte v7, p0, La/dpn;->e:B

    .line 26
    .line 27
    invoke-static/range {v2 .. v7}, La/nnw0;->d(La/mm40;La/mdm;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    move-object v3, p1

    .line 34
    check-cast v3, La/fet;

    .line 35
    .line 36
    check-cast p2, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {v1}, La/x8x;->L(I)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    iget-object v0, p0, La/dpn;->b:La/mm40;

    .line 46
    .line 47
    iget-object v1, p0, La/dpn;->c:La/mdm;

    .line 48
    .line 49
    iget-object v2, p0, La/dpn;->d:Lkotlin/jvm/functions/Function0;

    .line 50
    .line 51
    iget-byte v5, p0, La/dpn;->e:B

    .line 52
    .line 53
    invoke-static/range {v0 .. v5}, La/vfc;->r(La/mm40;La/mdm;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 54
    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
