.class public final synthetic La/bx8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/mdm;

.field public final synthetic d:Z

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:B


# direct methods
.method public synthetic constructor <init>(La/mm40;La/mdm;ZLkotlin/jvm/functions/Function0;IIB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/bx8;->a:B

    iput-object p1, p0, La/bx8;->b:La/mm40;

    iput-object p2, p0, La/bx8;->c:La/mdm;

    iput-boolean p3, p0, La/bx8;->d:Z

    iput-object p4, p0, La/bx8;->e:Lkotlin/jvm/functions/Function0;

    iput-byte p6, p0, La/bx8;->f:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/bx8;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v5, p1

    .line 7
    check-cast v5, La/fet;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    invoke-static {p1}, La/x8x;->L(I)I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    iget-object v1, p0, La/bx8;->b:La/mm40;

    .line 20
    .line 21
    iget-object v2, p0, La/bx8;->c:La/mdm;

    .line 22
    .line 23
    iget-boolean v3, p0, La/bx8;->d:Z

    .line 24
    .line 25
    iget-object v4, p0, La/bx8;->e:Lkotlin/jvm/functions/Function0;

    .line 26
    .line 27
    iget-byte v7, p0, La/bx8;->f:B

    .line 28
    .line 29
    invoke-static/range {v1 .. v7}, La/nnw0;->h(La/mm40;La/mdm;ZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_0
    move-object v4, p1

    .line 36
    check-cast v4, La/fet;

    .line 37
    .line 38
    check-cast p2, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    const/4 p1, 0x1

    .line 44
    invoke-static {p1}, La/x8x;->L(I)I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    iget-object v0, p0, La/bx8;->b:La/mm40;

    .line 49
    .line 50
    iget-object v1, p0, La/bx8;->c:La/mdm;

    .line 51
    .line 52
    iget-boolean v2, p0, La/bx8;->d:Z

    .line 53
    .line 54
    iget-object v3, p0, La/bx8;->e:Lkotlin/jvm/functions/Function0;

    .line 55
    .line 56
    iget-byte v6, p0, La/bx8;->f:B

    .line 57
    .line 58
    invoke-static/range {v0 .. v6}, La/hmw0;->k(La/mm40;La/mdm;ZLkotlin/jvm/functions/Function0;La/fet;II)V

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
