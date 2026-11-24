.class public final La/ykj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[B

.field public final b:Ljava/lang/String;

.field public final c:Ljava/util/List;

.field public final d:Ljava/lang/String;

.field public e:Ljava/lang/Integer;

.field public f:Ljava/lang/Integer;

.field public g:Ljava/lang/Object;

.field public final h:I

.field public final i:I

.field public final j:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[B)V
    .locals 8

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, -0x1

    move-object v0, p0

    move-object v2, p1

    move-object v4, p2

    move-object v1, p3

    .line 19
    invoke-direct/range {v0 .. v7}, La/ykj;-><init>([BLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;III)V

    return-void
.end method

.method public constructor <init>([BLjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ykj;->a:[B

    .line 5
    .line 6
    iput-object p2, p0, La/ykj;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, La/ykj;->c:Ljava/util/List;

    .line 9
    .line 10
    iput-object p4, p0, La/ykj;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput p6, p0, La/ykj;->h:I

    .line 13
    .line 14
    iput p5, p0, La/ykj;->i:I

    .line 15
    .line 16
    iput p7, p0, La/ykj;->j:I

    .line 17
    .line 18
    return-void
.end method
