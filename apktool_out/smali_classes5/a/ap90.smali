.class public final La/ap90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ze3;


# instance fields
.field public final a:La/bot;

.field public final b:La/ctf0;

.field public final c:La/cad;

.field public final d:La/pru;

.field public final e:La/duj;

.field public final f:La/yp90;

.field public final g:La/imb;

.field public final h:La/je;

.field public final i:La/kt2;


# direct methods
.method public constructor <init>(La/bot;La/czt;La/ctf0;La/cad;La/pru;La/duj;La/yp90;La/imb;La/uqe;La/je;La/kt2;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/ap90;->a:La/bot;

    .line 14
    .line 15
    iput-object p3, p0, La/ap90;->b:La/ctf0;

    .line 16
    .line 17
    iput-object p4, p0, La/ap90;->c:La/cad;

    .line 18
    .line 19
    iput-object p5, p0, La/ap90;->d:La/pru;

    .line 20
    .line 21
    iput-object p6, p0, La/ap90;->e:La/duj;

    .line 22
    .line 23
    iput-object p7, p0, La/ap90;->f:La/yp90;

    .line 24
    .line 25
    iput-object p8, p0, La/ap90;->g:La/imb;

    .line 26
    .line 27
    iput-object p10, p0, La/ap90;->h:La/je;

    .line 28
    .line 29
    iput-object p11, p0, La/ap90;->i:La/kt2;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final a(Lorg/xplatform/picker/api/presentation/PickerParams;Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;)La/sni;
    .locals 12

    .line 1
    iget-object v3, p0, La/ap90;->b:La/ctf0;

    .line 2
    .line 3
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v6, p0, La/ap90;->f:La/yp90;

    .line 7
    .line 8
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v11, p0, La/ap90;->i:La/kt2;

    .line 12
    .line 13
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v0, La/sni;

    .line 17
    .line 18
    iget-object v1, p0, La/ap90;->c:La/cad;

    .line 19
    .line 20
    iget-object v4, p0, La/ap90;->d:La/pru;

    .line 21
    .line 22
    iget-object v5, p0, La/ap90;->e:La/duj;

    .line 23
    .line 24
    iget-object v7, p0, La/ap90;->g:La/imb;

    .line 25
    .line 26
    iget-object v8, p0, La/ap90;->a:La/bot;

    .line 27
    .line 28
    iget-object v10, p0, La/ap90;->h:La/je;

    .line 29
    .line 30
    move-object v2, p1

    .line 31
    move-object v9, p2

    .line 32
    invoke-direct/range {v0 .. v11}, La/sni;-><init>(La/cad;Lorg/xplatform/picker/api/presentation/PickerParams;La/ctf0;La/pru;La/duj;La/yp90;La/imb;La/bot;Lorg/xplatform/picker/api/presentation/AnalyticsEntryPoint;La/je;La/kt2;)V

    .line 33
    .line 34
    .line 35
    return-object v0
.end method
