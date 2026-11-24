.class public final synthetic La/hcf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/icf;

.field public final synthetic c:La/e0u;


# direct methods
.method public synthetic constructor <init>(La/icf;La/e0u;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/hcf;->a:B

    iput-object p1, p0, La/hcf;->b:La/icf;

    iput-object p2, p0, La/hcf;->c:La/e0u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-byte v0, p0, La/hcf;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/hcf;->c:La/e0u;

    .line 4
    .line 5
    iget-object p0, p0, La/hcf;->b:La/icf;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/icf;->d()La/ybf;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/a1d;

    .line 15
    .line 16
    invoke-virtual {p0, v1}, La/a1d;->j(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    invoke-virtual {p0}, La/icf;->d()La/ybf;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, La/a1d;

    .line 25
    .line 26
    invoke-virtual {p0, v1}, La/a1d;->j(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    invoke-virtual {p0}, La/icf;->d()La/ybf;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/a1d;

    .line 35
    .line 36
    invoke-virtual {p0, v1}, La/a1d;->j(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
