.class public final synthetic La/px9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vx9;

.field public final synthetic c:La/gnf0;


# direct methods
.method public synthetic constructor <init>(La/vx9;La/ux9;La/gnf0;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/px9;->a:B

    iput-object p1, p0, La/px9;->b:La/vx9;

    iput-object p3, p0, La/px9;->c:La/gnf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-byte v0, p0, La/px9;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/px9;->c:La/gnf0;

    .line 7
    .line 8
    invoke-static {v0}, La/ux9;->g(La/gnf0;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object p0, p0, La/px9;->b:La/vx9;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, La/vx9;->a(I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, La/px9;->c:La/gnf0;

    .line 19
    .line 20
    invoke-static {v0}, La/ux9;->g(La/gnf0;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object p0, p0, La/px9;->b:La/vx9;

    .line 25
    .line 26
    invoke-virtual {p0, v0}, La/vx9;->e(I)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
