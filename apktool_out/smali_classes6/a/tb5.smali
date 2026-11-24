.class public final synthetic La/tb5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z

.field public final synthetic c:B

.field public final synthetic d:Z

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILa/mm40;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/tb5;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, La/tb5;->e:Ljava/lang/Object;

    iput-boolean p4, p0, La/tb5;->b:Z

    iput-byte p1, p0, La/tb5;->c:B

    iput-boolean p2, p0, La/tb5;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function0;II)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/tb5;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/tb5;->b:Z

    iput-object p2, p0, La/tb5;->e:Ljava/lang/Object;

    iput-byte p3, p0, La/tb5;->c:B

    iput-boolean p4, p0, La/tb5;->d:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/tb5;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/tb5;->e:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, La/mm40;

    .line 9
    .line 10
    check-cast p1, La/fet;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-byte p2, p0, La/tb5;->c:B

    .line 18
    .line 19
    or-int/lit8 p2, p2, 0x1

    .line 20
    .line 21
    invoke-static {p2}, La/x8x;->L(I)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    iget-boolean v1, p0, La/tb5;->b:Z

    .line 26
    .line 27
    iget-boolean p0, p0, La/tb5;->d:Z

    .line 28
    .line 29
    invoke-static {v0, v1, p1, p2, p0}, La/d7x;->p(La/mm40;ZLa/fet;II)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_0
    iget-object v0, p0, La/tb5;->e:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lkotlin/jvm/functions/Function0;

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
    iget-byte p2, p0, La/tb5;->c:B

    .line 47
    .line 48
    or-int/lit8 p2, p2, 0x1

    .line 49
    .line 50
    invoke-static {p2}, La/x8x;->L(I)I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    iget-boolean v1, p0, La/tb5;->b:Z

    .line 55
    .line 56
    iget-boolean p0, p0, La/tb5;->d:Z

    .line 57
    .line 58
    invoke-static {v1, v0, p1, p2, p0}, La/knx;->i(ZLkotlin/jvm/functions/Function0;La/fet;II)V

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
