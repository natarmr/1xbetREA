.class public final La/vlr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ze3;


# instance fields
.field public final a:La/iw20;

.field public final b:La/gkr0;

.field public final c:La/sd80;

.field public final d:La/btt0;

.field public final e:La/ctf0;

.field public final f:La/cad;


# direct methods
.method public constructor <init>(La/iw20;La/gkr0;La/sd80;La/btt0;La/kl5;La/ctf0;La/cad;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/vlr0;->a:La/iw20;

    .line 17
    .line 18
    iput-object p2, p0, La/vlr0;->b:La/gkr0;

    .line 19
    .line 20
    iput-object p3, p0, La/vlr0;->c:La/sd80;

    .line 21
    .line 22
    iput-object p4, p0, La/vlr0;->d:La/btt0;

    .line 23
    .line 24
    iput-object p6, p0, La/vlr0;->e:La/ctf0;

    .line 25
    .line 26
    iput-object p7, p0, La/vlr0;->f:La/cad;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a()La/ywq0;
    .locals 5

    .line 1
    iget-object v0, p0, La/vlr0;->d:La/btt0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/vlr0;->b:La/gkr0;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, La/vlr0;->c:La/sd80;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, La/vlr0;->e:La/ctf0;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v3, La/ywq0;

    .line 22
    .line 23
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v4, p0, La/vlr0;->a:La/iw20;

    .line 27
    .line 28
    iput-object v4, v3, La/ywq0;->a:Ljava/lang/Object;

    .line 29
    .line 30
    iput-object v0, v3, La/ywq0;->b:Ljava/lang/Object;

    .line 31
    .line 32
    iput-object v1, v3, La/ywq0;->c:Ljava/lang/Object;

    .line 33
    .line 34
    iput-object v2, v3, La/ywq0;->d:Ljava/lang/Object;

    .line 35
    .line 36
    iget-object p0, p0, La/vlr0;->f:La/cad;

    .line 37
    .line 38
    iput-object p0, v3, La/ywq0;->e:Ljava/lang/Object;

    .line 39
    .line 40
    new-instance p0, La/msi;

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    const/16 v1, 0xd

    .line 44
    .line 45
    invoke-direct {p0, v3, v0, v1}, La/msi;-><init>(Ljava/lang/Object;IB)V

    .line 46
    .line 47
    .line 48
    iput-object p0, v3, La/ywq0;->f:Ljava/lang/Object;

    .line 49
    .line 50
    new-instance p0, La/msi;

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    invoke-direct {p0, v3, v0, v1}, La/msi;-><init>(Ljava/lang/Object;IB)V

    .line 54
    .line 55
    .line 56
    iput-object p0, v3, La/ywq0;->g:Ljava/lang/Object;

    .line 57
    .line 58
    return-object v3
.end method
