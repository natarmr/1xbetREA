.class public final La/u39;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kwk;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pbz;


# direct methods
.method public synthetic constructor <init>(La/pbz;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/u39;->a:B

    iput-object p1, p0, La/u39;->b:La/pbz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-byte v0, p0, La/u39;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/u39;->b:La/pbz;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, La/pbz;->f:Z

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, La/pbz;->d:I

    .line 13
    .line 14
    iget-object v0, p0, La/pbz;->b:La/qbz;

    .line 15
    .line 16
    iget-object v0, v0, La/qbz;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->remove(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, La/pbz;->e:La/pbz;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, La/pbz;->b()V

    .line 26
    .line 27
    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    iput-object v0, p0, La/pbz;->e:La/pbz;

    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_0
    if-eqz p0, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0}, La/pbz;->b()V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void

    .line 38
    :pswitch_1
    if-eqz p0, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0}, La/pbz;->b()V

    .line 41
    .line 42
    .line 43
    :cond_2
    return-void

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
