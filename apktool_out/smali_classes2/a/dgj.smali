.class public final synthetic La/dgj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/x2i;

.field public final synthetic c:La/cp;


# direct methods
.method public synthetic constructor <init>(La/x2i;La/cp;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/dgj;->a:B

    iput-object p1, p0, La/dgj;->b:La/x2i;

    iput-object p2, p0, La/dgj;->c:La/cp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/dgj;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/dgj;->c:La/cp;

    .line 4
    .line 5
    iget-object p0, p0, La/dgj;->b:La/x2i;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0, v0}, La/x2i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-static {}, La/dyb;->u0()V

    .line 18
    .line 19
    .line 20
    :goto_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {v1}, La/cp;->u()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0, v0}, La/x2i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-static {}, La/dyb;->u0()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
