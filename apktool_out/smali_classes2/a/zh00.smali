.class public final La/zh00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ee60;


# instance fields
.field public a:Ljava/lang/Object;

.field public final synthetic b:La/fpv0;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:La/svs0;

.field public final synthetic e:La/ro30;


# direct methods
.method public constructor <init>(La/fpv0;Ljava/lang/Object;La/svs0;La/ro30;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/zh00;->b:La/fpv0;

    .line 5
    .line 6
    iput-object p2, p0, La/zh00;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, La/zh00;->d:La/svs0;

    .line 9
    .line 10
    iput-object p4, p0, La/zh00;->e:La/ro30;

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iput-object p1, p0, La/zh00;->a:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 3

    .line 1
    new-instance v0, La/lfr;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, p0, p1, v2, v1}, La/lfr;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZB)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/zh00;->b:La/fpv0;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, La/fpv0;->a(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
