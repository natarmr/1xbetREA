.class public final La/a39;
.super La/lm40;
.source "SourceFile"


# instance fields
.field public o:La/e33;

.field public final p:La/d38;


# direct methods
.method public constructor <init>(La/e33;)V
    .locals 1

    .line 1
    invoke-direct {p0}, La/lm40;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/a39;->o:La/e33;

    .line 5
    .line 6
    new-instance p1, La/d38;

    .line 7
    .line 8
    const/16 v0, 0xf

    .line 9
    .line 10
    invoke-direct {p1, p0, v0}, La/d38;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/a39;->p:La/d38;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final R0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/a39;->o:La/e33;

    .line 2
    .line 3
    iget-object p0, p0, La/a39;->p:La/d38;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, La/e33;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final S0()V
    .locals 1

    .line 1
    iget-object p0, p0, La/a39;->o:La/e33;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, v0}, La/e33;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    return-void
.end method
