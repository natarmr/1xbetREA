.class public final La/ka5;
.super La/lm40;
.source "SourceFile"


# instance fields
.field public o:La/scq0;

.field public final synthetic p:La/la5;


# direct methods
.method public constructor <init>(La/la5;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ka5;->p:La/la5;

    .line 2
    .line 3
    invoke-direct {p0}, La/lm40;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final R0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/ka5;->p:La/la5;

    .line 2
    .line 3
    iput-object p0, v0, La/la5;->b:La/ka5;

    .line 4
    .line 5
    iget-object v1, v0, La/la5;->c:La/odd;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v1, La/ys3;

    .line 10
    .line 11
    const/16 v2, 0x1a

    .line 12
    .line 13
    invoke-direct {v1, p0, v0, v2}, La/ys3;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v1}, La/x4d0;->f0(La/lm40;Lkotlin/jvm/functions/Function1;)La/scq0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, La/ka5;->o:La/scq0;

    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final S0()V
    .locals 3

    .line 1
    iget-object v0, p0, La/ka5;->p:La/la5;

    .line 2
    .line 3
    iget-object v1, v0, La/la5;->b:La/ka5;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v1, p0, :cond_0

    .line 7
    .line 8
    iput-object v2, v0, La/la5;->b:La/ka5;

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, La/ka5;->o:La/scq0;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, La/scq0;->b()V

    .line 15
    .line 16
    .line 17
    :cond_1
    iput-object v2, p0, La/ka5;->o:La/scq0;

    .line 18
    .line 19
    return-void
.end method
