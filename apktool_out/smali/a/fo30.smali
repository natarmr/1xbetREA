.class public final synthetic La/fo30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/go30;

.field public final synthetic c:Landroid/util/Pair;

.field public final synthetic d:La/wn00;

.field public final synthetic e:La/in30;


# direct methods
.method public synthetic constructor <init>(La/go30;Landroid/util/Pair;La/wn00;La/in30;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/fo30;->a:B

    iput-object p1, p0, La/fo30;->b:La/go30;

    iput-object p2, p0, La/fo30;->c:Landroid/util/Pair;

    iput-object p3, p0, La/fo30;->d:La/wn00;

    iput-object p4, p0, La/fo30;->e:La/in30;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-byte v0, p0, La/fo30;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/fo30;->e:La/in30;

    .line 4
    .line 5
    iget-object v2, p0, La/fo30;->d:La/wn00;

    .line 6
    .line 7
    iget-object v3, p0, La/fo30;->c:Landroid/util/Pair;

    .line 8
    .line 9
    iget-object p0, p0, La/fo30;->b:La/go30;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/go30;->b:La/jo30;

    .line 15
    .line 16
    iget-object p0, p0, La/jo30;->i:La/fsj;

    .line 17
    .line 18
    iget-object v0, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v3, La/vn30;

    .line 29
    .line 30
    invoke-virtual {p0, v0, v3, v2, v1}, La/fsj;->r(ILa/vn30;La/wn00;La/in30;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_0
    iget-object p0, p0, La/go30;->b:La/jo30;

    .line 35
    .line 36
    iget-object p0, p0, La/jo30;->i:La/fsj;

    .line 37
    .line 38
    iget-object v0, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ljava/lang/Integer;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v3, La/vn30;

    .line 49
    .line 50
    invoke-virtual {p0, v0, v3, v2, v1}, La/fsj;->j(ILa/vn30;La/wn00;La/in30;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
