.class public final La/k9i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/cad;

.field public final b:La/ie5;

.field public final c:La/ie5;

.field public final d:La/azj0;


# direct methods
.method public constructor <init>(La/cad;La/azj0;La/ie5;La/ie5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/k9i;->a:La/cad;

    .line 5
    .line 6
    iput-object p4, p0, La/k9i;->b:La/ie5;

    .line 7
    .line 8
    iput-object p3, p0, La/k9i;->c:La/ie5;

    .line 9
    .line 10
    iput-object p2, p0, La/k9i;->d:La/azj0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()La/xex;
    .locals 2

    .line 1
    iget-object v0, p0, La/k9i;->a:La/cad;

    .line 2
    .line 3
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/psc;

    .line 6
    .line 7
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/k9i;->b:La/ie5;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v1, La/xex;

    .line 20
    .line 21
    invoke-direct {v1, v0, p0}, La/xex;-><init>(La/mne;La/ie5;)V

    .line 22
    .line 23
    .line 24
    return-object v1
.end method

.method public final b()La/xex;
    .locals 2

    .line 1
    iget-object v0, p0, La/k9i;->a:La/cad;

    .line 2
    .line 3
    iget-object v0, v0, La/cad;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/psc;

    .line 6
    .line 7
    invoke-virtual {v0}, La/psc;->h()La/mne;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/k9i;->c:La/ie5;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v1, La/xex;

    .line 20
    .line 21
    invoke-direct {v1, v0, p0}, La/xex;-><init>(La/mne;La/ie5;)V

    .line 22
    .line 23
    .line 24
    return-object v1
.end method
