.class public final synthetic La/z360;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:La/mm40;


# direct methods
.method public synthetic constructor <init>(La/mm40;ZZI)V
    .locals 0

    .line 1
    const/4 p4, 0x0

    iput-byte p4, p0, La/z360;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/z360;->d:La/mm40;

    iput-boolean p2, p0, La/z360;->b:Z

    iput-boolean p3, p0, La/z360;->c:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZLa/mm40;I)V
    .locals 0

    .line 2
    const/4 p4, 0x1

    iput-byte p4, p0, La/z360;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/z360;->b:Z

    iput-boolean p2, p0, La/z360;->c:Z

    iput-object p3, p0, La/z360;->d:La/mm40;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/z360;->a:B

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
    const/4 p2, 0x1

    .line 14
    invoke-static {p2}, La/x8x;->L(I)I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    iget-object v0, p0, La/z360;->d:La/mm40;

    .line 19
    .line 20
    iget-boolean v1, p0, La/z360;->b:Z

    .line 21
    .line 22
    iget-boolean p0, p0, La/z360;->c:Z

    .line 23
    .line 24
    invoke-static {p2, p1, v0, v1, p0}, La/xdx;->s(ILa/fet;La/mm40;ZZ)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    const/4 p2, 0x1

    .line 31
    invoke-static {p2}, La/x8x;->L(I)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    iget-object v0, p0, La/z360;->d:La/mm40;

    .line 36
    .line 37
    iget-boolean v1, p0, La/z360;->b:Z

    .line 38
    .line 39
    iget-boolean p0, p0, La/z360;->c:Z

    .line 40
    .line 41
    invoke-static {p2, p1, v0, v1, p0}, La/u7x;->g(ILa/fet;La/mm40;ZZ)V

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
