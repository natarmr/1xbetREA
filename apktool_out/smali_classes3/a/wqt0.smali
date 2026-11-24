.class public final synthetic La/wqt0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xqt0;

.field public final synthetic c:La/vne;


# direct methods
.method public synthetic constructor <init>(La/xqt0;La/vne;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wqt0;->a:B

    iput-object p1, p0, La/wqt0;->b:La/xqt0;

    iput-object p2, p0, La/wqt0;->c:La/vne;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/wqt0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/wqt0;->c:La/vne;

    .line 4
    .line 5
    iget-object p0, p0, La/wqt0;->b:La/xqt0;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Throwable;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, La/xqt0;->r:La/p7m0;

    .line 19
    .line 20
    sget-object v2, La/i8d;->e:La/i8d;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-virtual {v0, v3, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1, v1}, La/vw5;->f(Ljava/lang/Throwable;La/vne;)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1, v1}, La/vw5;->f(Ljava/lang/Throwable;La/vne;)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
