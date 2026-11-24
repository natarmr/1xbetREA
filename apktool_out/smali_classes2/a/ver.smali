.class public final La/ver;
.super La/wer;
.source "SourceFile"


# static fields
.field public static final d:La/ver;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/ver;

    .line 2
    .line 3
    sget-object v1, La/j4m0;->f:La/swq;

    .line 4
    .line 5
    sget-object v2, La/ser;->d:La/ser;

    .line 6
    .line 7
    iget v2, v2, La/wer;->c:I

    .line 8
    .line 9
    add-int/lit8 v2, v2, -0x1

    .line 10
    .line 11
    const-string v3, "SuspendFunction"

    .line 12
    .line 13
    invoke-direct {v0, v1, v3, v2}, La/wer;-><init>(La/swq;Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    sput-object v0, La/ver;->d:La/ver;

    .line 17
    .line 18
    return-void
.end method
