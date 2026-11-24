.class public final synthetic La/u6e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/e7e;


# direct methods
.method public synthetic constructor <init>(La/e7e;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/u6e;->a:B

    iput-object p1, p0, La/u6e;->b:La/e7e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-byte v0, p0, La/u6e;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/u6e;->b:La/e7e;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, La/e7e;->a2:Z

    .line 10
    .line 11
    invoke-virtual {p0}, La/e7e;->J0()La/fae;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0}, La/e7e;->I0()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-virtual {v0, p0}, La/fae;->C(I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    sget-object v0, La/e7e;->d2:La/kwd;

    .line 24
    .line 25
    invoke-virtual {p0}, La/e7e;->H0()La/kzq;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p0}, La/e7e;->G0()La/d6e;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, La/zz3;->d()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {p0}, La/e7e;->I0()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    sub-int/2addr v1, v2

    .line 42
    iget-object v0, v0, La/kzq;->o:Landroidx/recyclerview/widget/RecyclerView;

    .line 43
    .line 44
    const/4 v2, 0x4

    .line 45
    if-gt v1, v2, :cond_0

    .line 46
    .line 47
    invoke-virtual {p0}, La/e7e;->G0()La/d6e;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, La/zz3;->d()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    add-int/lit8 p0, p0, -0x1

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->B0(I)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {p0}, La/e7e;->G0()La/d6e;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p0}, La/zz3;->d()I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    add-int/lit8 p0, p0, -0x1

    .line 70
    .line 71
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->y0(I)V

    .line 72
    .line 73
    .line 74
    :goto_0
    return-void

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
