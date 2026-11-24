.class public final La/a5e0;
.super La/w8b;
.source "SourceFile"


# instance fields
.field public final d:La/lc00;


# direct methods
.method public constructor <init>(Ljava/lang/String;La/lc00;II)V
    .locals 1

    .line 1
    invoke-static {p1, p1}, La/vqd;->e(Ljava/lang/String;Ljava/lang/String;)La/h9b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p4

    .line 9
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    const/4 v0, 0x6

    .line 14
    invoke-direct {p0, p1, p4, p3, v0}, La/w8b;-><init>(La/h9b;Ljava/lang/Integer;Ljava/lang/Integer;I)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, La/a5e0;->d:La/lc00;

    .line 18
    .line 19
    return-void
.end method
