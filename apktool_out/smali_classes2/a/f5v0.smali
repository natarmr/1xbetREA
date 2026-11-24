.class public final La/f5v0;
.super La/r8x;
.source "SourceFile"


# instance fields
.field public final b:La/e5v0;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/svs0;

    .line 5
    .line 6
    const/16 v1, 0xd

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/svs0;-><init>(B)V

    .line 9
    .line 10
    .line 11
    new-instance v1, La/e5v0;

    .line 12
    .line 13
    invoke-direct {v1, v0}, La/tw00;-><init>(La/uw00;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, La/f5v0;->b:La/e5v0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final K()La/bsr0;
    .locals 0

    .line 1
    iget-object p0, p0, La/f5v0;->b:La/e5v0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final P()La/vw00;
    .locals 0

    .line 1
    sget-object p0, La/vw00;->c:La/vw00;

    .line 2
    .line 3
    return-object p0
.end method
