.class public final synthetic La/za4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pkk0;

.field public final synthetic c:La/wpq;


# direct methods
.method public synthetic constructor <init>(La/pkk0;La/wpq;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/za4;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/za4;->b:La/pkk0;

    iput-object p2, p0, La/za4;->c:La/wpq;

    return-void
.end method

.method public synthetic constructor <init>(La/wpq;La/pkk0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/za4;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/za4;->c:La/wpq;

    iput-object p2, p0, La/za4;->b:La/pkk0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/za4;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/za4;->c:La/wpq;

    .line 4
    .line 5
    iget-object p0, p0, La/za4;->b:La/pkk0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/z3f0;->Y1:La/zie0;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    check-cast p0, La/r3k;

    .line 15
    .line 16
    invoke-virtual {p0}, La/r3k;->a()V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-static {v1}, La/wpq;->a(La/wpq;)V

    .line 20
    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    invoke-static {v1}, La/wpq;->a(La/wpq;)V

    .line 26
    .line 27
    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    check-cast p0, La/r3k;

    .line 31
    .line 32
    invoke-virtual {p0}, La/r3k;->a()V

    .line 33
    .line 34
    .line 35
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
