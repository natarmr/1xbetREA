.class public final La/pru;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/j1q0;

.field public final b:La/vff0;


# direct methods
.method public constructor <init>(La/nwd;La/vff0;La/j1q0;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p3, p0, La/pru;->a:La/j1q0;

    .line 11
    .line 12
    iput-object p2, p0, La/pru;->b:La/vff0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a()La/sff0;
    .locals 2

    .line 1
    iget-object v0, p0, La/pru;->a:La/j1q0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/j1q0;->b()La/rhi0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 8
    .line 9
    invoke-virtual {v0}, La/m1q0;->q()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object p0, p0, La/pru;->b:La/vff0;

    .line 14
    .line 15
    invoke-virtual {p0, v1, v0}, La/vff0;->a(La/rhi0;Z)La/sff0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
