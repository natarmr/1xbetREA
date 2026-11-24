.class public final La/fai;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p0h0;


# instance fields
.field public final synthetic a:La/n8i;


# direct methods
.method public constructor <init>(La/n8i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/fai;->a:La/n8i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/vzg0;)La/diu0;
    .locals 7

    .line 1
    new-instance v0, La/z28;

    .line 2
    .line 3
    iget-object p0, p0, La/fai;->a:La/n8i;

    .line 4
    .line 5
    iget-object p0, p0, La/n8i;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/gai;

    .line 8
    .line 9
    iget-object v2, p0, La/gai;->a:La/i1w0;

    .line 10
    .line 11
    iget-object v3, p0, La/gai;->b:Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;

    .line 12
    .line 13
    iget-object v4, p0, La/gai;->c:La/zg;

    .line 14
    .line 15
    iget-object v5, p0, La/gai;->d:La/m1e;

    .line 16
    .line 17
    iget-object v6, p0, La/gai;->e:La/mne;

    .line 18
    .line 19
    move-object v1, p1

    .line 20
    invoke-direct/range {v0 .. v6}, La/z28;-><init>(La/vzg0;La/i1w0;Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;La/zg;La/m1e;La/mne;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method
