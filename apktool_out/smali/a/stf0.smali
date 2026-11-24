.class public final synthetic La/stf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ybf;

.field public final synthetic c:La/e0u;


# direct methods
.method public synthetic constructor <init>(La/ybf;La/e0u;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/stf0;->a:B

    iput-object p1, p0, La/stf0;->b:La/ybf;

    iput-object p2, p0, La/stf0;->c:La/e0u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-byte v0, p0, La/stf0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/stf0;->c:La/e0u;

    .line 4
    .line 5
    iget-object p0, p0, La/stf0;->b:La/ybf;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, La/d0u;

    .line 13
    .line 14
    const-string v0, "No provider data returned"

    .line 15
    .line 16
    const/4 v2, 0x3

    .line 17
    invoke-direct {v1, v0, v2}, La/d0u;-><init>(Ljava/lang/CharSequence;B)V

    .line 18
    .line 19
    .line 20
    :cond_0
    check-cast p0, La/a1d;

    .line 21
    .line 22
    invoke-virtual {p0, v1}, La/a1d;->j(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    check-cast p0, La/a1d;

    .line 27
    .line 28
    invoke-virtual {p0, v1}, La/a1d;->j(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
