.class public final synthetic La/vlo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:La/dmo;

.field public final synthetic b:I

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(La/dmo;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vlo;->a:La/dmo;

    iput p2, p0, La/vlo;->b:I

    iput-boolean p3, p0, La/vlo;->c:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, La/vlo;->a:La/dmo;

    .line 2
    .line 3
    iget-object v1, v0, La/dmo;->w:La/fsj;

    .line 4
    .line 5
    iget-object v0, v0, La/dmo;->a:[La/ujf0;

    .line 6
    .line 7
    iget v2, p0, La/vlo;->b:I

    .line 8
    .line 9
    aget-object v0, v0, v2

    .line 10
    .line 11
    iget-object v0, v0, La/ujf0;->e:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, La/j16;

    .line 14
    .line 15
    iget-byte v0, v0, La/j16;->b:B

    .line 16
    .line 17
    invoke-virtual {v1}, La/fsj;->M()La/ft2;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    new-instance v4, La/t9f;

    .line 22
    .line 23
    iget-boolean p0, p0, La/vlo;->c:Z

    .line 24
    .line 25
    invoke-direct {v4, v3, v2, v0, p0}, La/t9f;-><init>(La/ft2;IIZ)V

    .line 26
    .line 27
    .line 28
    const/16 p0, 0x409

    .line 29
    .line 30
    invoke-virtual {v1, v3, p0, v4}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
