.class public final La/j0x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xyw0;

.field public final synthetic c:J

.field public final synthetic d:Z

.field public final synthetic e:La/b1x0;


# direct methods
.method public synthetic constructor <init>(La/b1x0;La/xyw0;JZB)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/j0x0;->a:B

    iput-object p2, p0, La/j0x0;->b:La/xyw0;

    iput-wide p3, p0, La/j0x0;->c:J

    iput-boolean p5, p0, La/j0x0;->d:Z

    iput-object p1, p0, La/j0x0;->e:La/b1x0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-byte v0, p0, La/j0x0;->a:B

    .line 2
    .line 3
    iget-wide v1, p0, La/j0x0;->c:J

    .line 4
    .line 5
    iget-boolean v3, p0, La/j0x0;->d:Z

    .line 6
    .line 7
    iget-object v4, p0, La/j0x0;->b:La/xyw0;

    .line 8
    .line 9
    iget-object p0, p0, La/j0x0;->e:La/b1x0;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v4}, La/b1x0;->L1(La/xyw0;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v4, v1, v2, v3}, La/b1x0;->B1(La/xyw0;JZ)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    invoke-virtual {p0, v4}, La/b1x0;->L1(La/xyw0;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v4, v1, v2, v3}, La/b1x0;->B1(La/xyw0;JZ)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
