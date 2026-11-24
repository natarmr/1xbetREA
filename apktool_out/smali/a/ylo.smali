.class public final La/ylo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:La/dmo;


# direct methods
.method public constructor <init>(La/dmo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ylo;->a:La/dmo;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object p0, p0, La/ylo;->a:La/dmo;

    .line 2
    .line 3
    iget-boolean v0, p0, La/dmo;->v:Z

    .line 4
    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget-boolean v0, p0, La/dmo;->Z:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, La/dmo;->Y:La/uch0;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-boolean v0, p0, La/dmo;->u1:Z

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return-void

    .line 23
    :cond_2
    :goto_0
    iget-object p0, p0, La/dmo;->g:La/q9o0;

    .line 24
    .line 25
    const/4 v0, 0x2

    .line 26
    invoke-virtual {p0, v0}, La/q9o0;->h(I)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
