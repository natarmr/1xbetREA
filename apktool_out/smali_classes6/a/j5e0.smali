.class public final La/j5e0;
.super La/w8b;
.source "SourceFile"


# instance fields
.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;La/lc00;II)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/h9b;

    .line 5
    .line 6
    invoke-direct {v0, p1}, La/h9b;-><init>(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p4

    .line 13
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    const/4 v1, 0x6

    .line 18
    invoke-direct {p0, v0, p4, p3, v1}, La/w8b;-><init>(La/h9b;Ljava/lang/Integer;Ljava/lang/Integer;I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, La/j5e0;->d:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p2, p0, La/j5e0;->e:Ljava/util/List;

    .line 24
    .line 25
    return-void
.end method
